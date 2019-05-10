/**
 * Bug.java
 * Models a bug moving along a horizontal line
 * @author Hunter Damron
 * Honor code: This is my own work
 * Purpose: Bug class moves horizontally at 1 unit per second and can turn
 */
public class Bug {
	/*
	 * Instance variables
	 */
	private int position;
	private int direction; //Positive 1 for positive direction
	
	/*
	 * Construct a Bug facing to the right at initial position.
	 */
	public Bug(int initialPosition) {
		position = initialPosition;
		direction = 1;
	}
	/**
	 * The bug turns to face the opposite direction but remains in the same place
	 */
	public void turn() {
		direction = direction * -1;
	}
	/**
	 * The bug moves one unit in the direction that it is facing
	 */
	public void move() {
		position = position + direction;
	}
	/**
	 * returns the position where the bug is currently positioned
	 */
	public int getPosition(){
		return position;
	}
}

