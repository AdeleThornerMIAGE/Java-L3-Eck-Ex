
public class EE43 {

	public static int numberOfRolls(int nb) {
		if(nb<2 || nb>12) {
			throw new IllegalArgumentException("La somme de deux d�s est comprise entre 2 et 12");
		}
		else {
			int dice1=0;
			int dice2=0;
			boolean nbFound=false; //nbFound devient vrai quand on a trouv� le nb en param�tre
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
		System.out.println("Il faut "+numberOfRolls(2)+" lancers de d�s avant d'obtenir 'Snake eyes'.");
	}
}
