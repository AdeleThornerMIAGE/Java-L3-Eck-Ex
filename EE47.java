package mypackagejava;
import java.util.Scanner;


public class EE47 {
	private static int[] leftNumber=new int[10];
	private static int[] rightNumber=new int[10];
	private static int[] userAnswer=new int[10];
	
	/**
	 * initialise un quiz avec des valeurs comprises entre 0 et 99 pour les membres des additions
	 */
	public static void createQuiz() {
		for(int i=0;i<10;i++) {  
			leftNumber[i]=(int)(Math.random()*100);
			rightNumber[i]=(int)(Math.random()*100);
		}
	}
	
	/**
	 * pose les 10 questions du quiz à l'utilisateur et récupère les réponses
	 */
	public static void adminQuiz() {
		int nbQuestion=0;
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			nbQuestion++;
			System.out.println("Question "+nbQuestion+": "+leftNumber[i]+" + "+rightNumber[i]+" ?");
			userAnswer[i]=Integer.parseInt(scn.nextLine());
		}
		scn.close();
	}
	
	/**
	 * Corrige le quiz et affiche les scores
	 */
	public static void gradeQuiz() {
		int grade=0;
		int nbQuestion=0;
		String correct="Incorrect";
		for(int i=0;i<10;i++) {
			nbQuestion++;
			if(leftNumber[i]+rightNumber[i]==userAnswer[i]) {
				grade++;
				correct="Correct";
			}
			else {
				correct="Incorrect";
			}
			String res="Question "+nbQuestion+": "+leftNumber[i]+" + "+rightNumber[i]+" = "+userAnswer[i]+"    "+correct;
			System.out.println(res);
		}
		System.out.println("Votre score est "+grade+"/10.");
	}
	
	public static void main(String[] args) {
		createQuiz();
		adminQuiz();
		gradeQuiz();
	}
}
