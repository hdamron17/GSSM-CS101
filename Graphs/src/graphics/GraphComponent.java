package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;

import javax.swing.JComponent;

public class GraphComponent extends JComponent {
	private int choice;
	private double a = 0, b = 0, c = 0;
	private Line2D line;
	Random gen = new Random();
	
	/**
	 * Constructs GraphComponent with choice
	 * @param choice Choice of image
	 */
	public GraphComponent(int choice){
		this.choice = choice;
		line = new Line2D.Double();
	}
	
	/**
	 * Constructs GraphComponent for use as a polynomial
	 * @param choice Choice of image
	 * @param a Coefficient of x^2
	 * @param b Coefficient of x
	 * @param c y-Intercept
	 */
	public GraphComponent(int choice, double a, double b, double c){
		this.choice = choice;
		this.a = a;
		this.b = b;
		this.c = c;
		line = new Line2D.Double();
	}
	
	/**
	 * Paints the appropriate image based on choice
	 * //Overrides JComponent paintComponent()
	 */
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		switch(choice) {
		case 1:
			drawLines(g2); break;
		case 2:
			drawAxis(g2, this.getWidth(), this.getHeight()); break;
		case 3:
			drawGraph(g2, this.getWidth(), this.getHeight()); break;
		}
	}
	
	/**
	 * Draws twenty random connected lines of alternating color
	 * @param g2 Local graphics component
	 */
	private void drawLines(Graphics2D g2){
		double xRange = this.getWidth();
		double yRange = this.getHeight();
		Point2D begin = new Point2D.Double(), end = new Point2D.Double();
		
		end.setLocation(gen.nextDouble() * xRange, 
				gen.nextDouble() * yRange);
		for(int count = 1; count <= 20; count++) {		
			begin.setLocation(end);
			end.setLocation(gen.nextDouble() * xRange, 
					gen.nextDouble() * yRange);
			line.setLine(begin, end);
			if(count % 2 == 0)
				g2.setColor(Color.BLACK);
			else
				g2.setColor(Color.RED);
			g2.draw(line);
		}
	}
	
	/**
	 * Draws the x and y axes for a graph
	 * @param g2 Local graphics component
	 * @param length Width of graph
	 * @param height Height of graph
	 */
	private void drawAxis(Graphics2D g2, int length, int height){
		line = new Line2D.Double((length / 2), 0, (length / 2), height);
		g2.setColor(Color.BLACK);
		g2.draw(line);
		line = new Line2D.Double(0, (height / 2), length, (height / 2));
		g2.draw(line);
	}
	
	/**
	 * Graphs a polynomial by creating many small lines
	 * //Note: Range is defaulted to 20 units (20 wide and 20 high) 
	 * 		but it can be changed to suit the graph's needs
	 * @param g2 Local graphics component
	 * @param length Width of graph
	 * @param height Height of graph
	 */
	private void drawGraph(Graphics2D g2, int length, int height) {
		double x, xScaled, y, yScaled;
		double range = 20;
		Point2D begin = new Point2D.Double(), end = new Point2D.Double();
		drawAxis(g2, length, height);
		
		x = -10;
		xScaled = -getWidth() / 2;
		y = a * Math.pow(x, 2) + b * x + c;
		yScaled = y / range * getHeight();
		end.setLocation(xScaled + getWidth() / 2, -yScaled + getHeight() / 2);
		
		for(; xScaled <= getWidth() / 2; xScaled += 1) {
			begin.setLocation(end);
			x = xScaled / getWidth() * range;
			y = a * Math.pow(x, 2) + b * x + c;
			yScaled = y * getHeight() / range;
			end.setLocation(xScaled + getWidth() / 2, -yScaled + getHeight() / 2);
			line.setLine(begin, end);
			g2.draw(line);
		}
	}
}