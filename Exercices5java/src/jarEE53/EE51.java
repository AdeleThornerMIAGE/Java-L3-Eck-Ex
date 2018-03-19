package jarEE53;

public class EE51 {

	public static void main(String[] args) {
		int i=0;
		boolean snakeeyes=false;
		while(snakeeyes==false) {
			EE51PairOfDice dice=new EE51PairOfDice();
			if(dice.getDie1()==1 && dice.getDie2()==1) {
				snakeeyes=true;
			}
			i++;
		}
		System.out.println("Il faut "+i+" lancers de dés pour obtenir une somme égale à 2");
	}
}
