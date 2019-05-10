/**
 * Product.java
 * Hunter Damron
 * Honor Code: This is my work
 * Purpose: Class Product has name and double price and can use methods 
 * 		to get name/price or reduce the price
 */
public class Product {
	
	private String name;
	private double price;
	
	public Product(String productName, double productPrice) {
		name = productName;
		price = productPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void reducePrice(double reduction) {
		price = price - reduction;
		price = Math.max(price, 0);
	}
}
