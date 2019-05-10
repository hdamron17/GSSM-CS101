import java.util.HashMap;
import java.util.Random;

public class Country {
	private int troops; 
	private String name;
	private Continent continent; //1=N.America, 2=S.America, 3=Europe, 4=Africa, 5=Asia, 6=Australia
	private HashMap<String, Country> neighbors = new HashMap<String, Country>(6);
	private int owner;
	
	@Override public String toString() {
		return name + "[" + this.getStringContinent() + ", " + troops + " troops]";
	}
	
	public Country(String name, Continent continent) {
		this.name = name;
		this.continent = continent;
	}
	
	public void addNeighbors(Country... map) {
		for(Country country : map) {
			neighbors.put(country.getName(), country);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getTroops() {
		return troops;
	}
	
	public Continent getContinent() {
		return continent;
	}
	
	public String getStringContinent() {
		String out;
		switch(continent) {
		case NORTH_AMERICA:
			out = "North America";
			break;
		case SOUTH_AMERICA:
			out = "South America";
			break;
		case EUROPE:
			out = "Europe";
			break;
		case AFRICA:
			out = "Africa";
			break;
		case ASIA:
			out = "Asia";
			break;
		case AUSTRALIA:
			out = "Australia";
			break;
		default:
			out = "null";
		}
		return out;
	}
	
	public Boolean keyContains(Country country) {
		return neighbors.containsKey(country.getName());
	}
	
	public Boolean returnContains(Country country) {
		return neighbors.containsValue(country);
	}
	
	
	/**
	 * Attacks a neigboring country from the country
	 * @param enemy Neighboring country to be attacked
	 * @param withTroops Number of troops with which to attack
	 * @param defendTroops number of troops with which to defend
	 * @return Returns number of troops to eliminate from neighboring country
	 */
	public int attack(Country enemy, int withTroops, int defendTroops) {
		DieRoller dice = new DieRoller();
		Random gen = new Random();
		int enemyLoss;
		
		if(neighbors.containsValue(enemy) && withTroops <= 3 && withTroops <= (this.troops - 1)
			&& defendTroops <= 2 && defendTroops <= (enemy.getTroops() - 1)) {
				
				
				int ret = 0;
				return ret;
		} else {
			int ret = 0;
			return ret;
		}
	}
}
