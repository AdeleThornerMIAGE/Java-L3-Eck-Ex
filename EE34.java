import java.util.Scanner;

public class EE34 {

	public static void main(String[] args) {
		System.out.println("Ecrire quelque chose");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		scan.close();
		String[] res=s.split("[^A-Za-zéèàùçâêûîôäêÿüïöÂÊÛÎÔÄËÜÏÖñÑ]");
		for(int i=0;i<res.length;i++) {
			if(res[i].length()>0) {
				System.out.println(res[i]);				
			}
		}
		System.out.println();
	}
}
