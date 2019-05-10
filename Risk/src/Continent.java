
public enum Continent {
	NORTH_AMERICA (9), 
	SOUTH_AMERICA (4), 
	EUROPE (7), 
	AFRICA (6), 
	ASIA (12), 
	AUSTRALIA (4); 
	
	private final int countries;
	Continent(int countries) {
		this.countries = countries;
	}
	
	/**
	 * For testing purposes
	 * @return Always returns ASIA
	 */
	static Continent testMethod() {
		Continent ret = ASIA;
		return ret;
	}
	
	int getNumCountries() {
		return countries;
	}
}
