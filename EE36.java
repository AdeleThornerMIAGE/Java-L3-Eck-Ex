import java.util.*;

public class EE36 {
	public static int nbDivisors(int nb) {
		int res=1;
		for(int i=1;i<nb;i++) {
			if(nb%i==0) {
				res++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> nbMax=new ArrayList<Integer>();
		int divMax=1;
		for(int i=1;i<=10000;i++) {
			if(nbDivisors(i)==divMax) {
				nbMax.add(i);
			}
			if(nbDivisors(i)>divMax) {
				divMax=nbDivisors(i);
				nbMax=new ArrayList<Integer>();
				nbMax.add(i);
			}
		}
		System.out.println("Parmi les entiers de 1 à 10000, ceux ayant le plus grand nombre de diviseurs sont :");
		for(int j=0;j<nbMax.size();j++) {
			System.out.println(nbMax.get(j));
		}
		System.out.println("Ces nombres ont "+divMax+" diviseurs.");
	}
}
