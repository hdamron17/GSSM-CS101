public class Date {
	/** instance variables **/
	private int day;
	private int month;
	private int year;

	/**
	 * Constructor
	 */
	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	/*********************  accessor methods ***********************/
	public int getDay() {
		return day;
	}

	public int getMonth () {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		String stringMonth;
		switch(month) {
		case 1:
			stringMonth = "January";
			break;
		case 2:
			stringMonth = "February";
			break;
		case 3:
			stringMonth = "March";
			break;
		case 4:
			stringMonth = "April";
			break;
		case 5:
			stringMonth = "May";
			break;
		case 6:
			stringMonth = "June";
			break;
		case 7:
			stringMonth = "July";
			break;
		case 8:
			stringMonth = "August";
			break;
		case 9:
			stringMonth = "September";
			break;
		case 10:
			stringMonth = "October";
			break;
		case 11:
			stringMonth = "November";
			break;
		case 12:
			stringMonth = "December";
			break;
		default:
			stringMonth = "null";
		}
		return stringMonth;
	}


	/********************* mutator methods *************************/

	public void changeDay(int d) {
		day = d;
	}
	
	public void changeMonth(int m) {
		month = m;
	}
	
	public void changeYear(int y) {
		year = y;
	}

}