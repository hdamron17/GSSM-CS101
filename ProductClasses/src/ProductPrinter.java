/**
 * ProductPrinter.java
 * Hunter Damron
 * Honor Code: I created this stuff on my own
 * Purpose: Utilizes Product Class to initialize product objects with name 
 * 		and price variables then reduces each price by $5.00
 */

import java.text.DecimalFormat;

public class ProductPrinter {
	public static void main(String[] args) {
		Product yamFooFoo = new Product("Yam Foo-Foo", 67.99);
		Product croqueMonsieur = new Product("Croque Monsieur", 6.50);
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		System.out.println("Product #1 is " + yamFooFoo.getName()
		+ " with a price of $" + fmt.format(yamFooFoo.getPrice())
		+ "\nProduct #2 is " + croqueMonsieur.getName() 
		+ " with a price of $" + fmt.format(croqueMonsieur.getPrice()));
		yamFooFoo.reducePrice(5);
		croqueMonsieur.reducePrice(5);		
		System.out.println("\nProduct #1 is " + yamFooFoo.getName()
		+ " with a price now of $" + fmt.format(yamFooFoo.getPrice())
		+ "\nProduct #2 is " + croqueMonsieur.getName() 
		+ " with a price now of $" + fmt.format(croqueMonsieur.getPrice()));
	}
}

/**
 * Note: the format() method of DecimalFormat class outputs a string 
 * 		with the specified number formatting
 * Cannot be used as a number after formatting
 */
