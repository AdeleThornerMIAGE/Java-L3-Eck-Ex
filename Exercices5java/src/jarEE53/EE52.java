package jarEE53;
import java.util.*;

public class EE52 {

	public static void main(String[] args) {
		EE52StatCalc stats=new EE52StatCalc();
		boolean continueSaisie=true;
		Scanner scan=new Scanner(System.in);
		while(continueSaisie) {
			System.out.println("Rentrer un nombre");
			double entree=Double.parseDouble(scan.nextLine());
			
			if(entree!=0) {
				stats.enter(entree);
			}
			else {
				continueSaisie=false;
			}
			
		}
		scan.close();
		System.out.println("Nombre de données :"+stats.getCount());
		System.out.println("Maximum :"+stats.getMax());
		System.out.println("Moyenne :"+stats.getMean());
		System.out.println("Minimum :"+stats.getMin());
		System.out.println("Variance :"+stats.getStandardDeviation());
		System.out.println("Somme :"+stats.getSum());
	}
}
