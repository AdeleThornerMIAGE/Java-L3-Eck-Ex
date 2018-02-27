package mypackagejava;


public class EE43 {

	/**
	 * numberOfRolls compte le nombre de lancers de deux dés nécessaires pour obtenir leur somme égale à nb.
	 * @param nb
	 * @return le nombre de lancers de deux dés nécessaires pour obtenir leur somme égale à nb
	 */
	public static int numberOfRolls(int nb) {
		if(nb<2 || nb>12) {
			throw new IllegalArgumentException("La somme de deux dés est comprise entre 2 et 12");
		}
		else {
			int dice1=0;
			int dice2=0;
			boolean nbFound=false;
			int counter=0;
			while(!nbFound) {
				counter++;
				dice1=(int)(Math.random()*6)+1;
				dice2=(int)(Math.random()*6)+1;
				if(dice1+dice2==nb) {
					nbFound=true;
				}
			}
			return counter;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Il faut "+numberOfRolls(2)+" lancers de dés avant d'obtenir 'Snake eyes'.");
	}
}
