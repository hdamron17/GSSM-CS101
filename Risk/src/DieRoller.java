import java.util.Random;
public class DieRoller {
	private Random gen;
	
	public DieRoller() {
		gen = new Random();
		//Seemingly empty for now
	}
	
	public int roll() {
		return gen.nextInt(6) + 1;
	}
	
	/**
	 * @deprecated
	 * @param attackDice
	 * @param defendDice
	 * @return
	 */
	public int[] versus(int attackDice, Country defendDice) {
		
		//For testing:
		int attackerLoss, defenderLoss;
		int[] losses = new int[2];
		
		//until replacement is found
		attackerLoss = 0; defenderLoss = 0;
		
		losses[0] = attackerLoss;
		losses[1] = defenderLoss;
		return losses;
	}
}
