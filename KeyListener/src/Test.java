import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Test implements KeyListener{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("KeyListener");
		frame.setSize(50, 100);
		frame.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		if(e.equals(KeyEvent.VK_UP))
			System.out.println("Up");
		if(e.equals(KeyEvent.VK_RIGHT))
			System.out.println("Right");
		if(e.equals(KeyEvent.VK_LEFT))
			System.out.println("Left");
		if(e.equals(KeyEvent.VK_DOWN))
			System.out.println("Down");
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
