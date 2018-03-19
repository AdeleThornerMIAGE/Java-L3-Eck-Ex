package jarEE53;

public class EE53 {

	/**
	 * Throws the pair of dice until the total is the integer entered as a parameter.
	 * Adds the number of rolls to the statistics
	 * @param stats
	 * @param sum
	 */
	public static void addStats(EE52StatCalc stats, int sum) {
		int total=0;
		int nbOfRolls=0;
		while(total!=sum) {
			EE51PairOfDice dice=new EE51PairOfDice();
			total=dice.getDie1()+dice.getDie2();
			nbOfRolls++;
		}
		stats.enter(nbOfRolls);
	}
	
	/**
	 * Computes statistics about the number of times a given total comes up as the sum of two dice
	 * @param sum of the dice
	 */
	public static void experiment(int sum) {
		EE52StatCalc stats=new EE52StatCalc();
		for(int i=0;i<=10000;i++) {
			addStats(stats,sum);
		}
		System.out.println("Statistics : sum of dice = "+sum);
		System.out.println("Average of rolls :"+stats.getMean());
		System.out.println("Standard deviation of rolls :"+stats.getStandardDeviation());
		System.out.println("Maximum of rolls :"+stats.getMax() +"\n");
	}
	
	public static void main(String[] args) {
		for(int i=2;i<=12;i++) {
			experiment(i);
		}
	}
}
