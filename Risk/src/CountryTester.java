public class CountryTester {
	public static void main(String[] args) {
		Country argentina, brazil, peru, venezuela; 
		argentina = new Country("argentina", Continent.SOUTH_AMERICA);
		brazil = new Country("brazil", Continent.SOUTH_AMERICA);
		peru = new Country("peru", Continent.SOUTH_AMERICA);
		venezuela = new Country("venezuela", Continent.SOUTH_AMERICA);
		Boolean[] tester = new Boolean[4];
		brazil.addNeighbors(argentina, peru, venezuela);
		venezuela.addNeighbors(peru, brazil);
		peru.addNeighbors(argentina, brazil, venezuela);
		argentina.addNeighbors(brazil, peru);
		tester[0] = argentina.keyContains(brazil);
		tester[1] = brazil.keyContains(peru);
		tester[2] = argentina.keyContains(venezuela);
		tester[3] = brazil.keyContains(brazil);
		System.out.println("Results are: " + tester[0] + " - " + tester[1] + " - " + tester[2] + " - " + tester[3]);
		System.out.println(argentina + ", " + brazil + "\n" + peru + ", " + venezuela);
	}
}
