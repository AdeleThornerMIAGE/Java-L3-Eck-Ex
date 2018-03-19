package jarEE53;

import java.util.Scanner;

public class EE57 {
	private EE57IntQuestion[] quiz;
	private int[] answers;
	
	/**
	 * creates the quiz with 5 addition question and 5 substraction question
	 */
	public EE57() {
		quiz=new EE57IntQuestion[10];
		answers=new int[10];
		for(int i=0;i<5;i++) {
			quiz[i]=new EE57AdditionQuestion();
		}
		for(int i=5;i<10;i++) {
			quiz[i]=new EE57SubstractionQuestion();
		}
	}
	
	/**
	 * asks the quiz and gets the answers
	 */
	public void getAnswers() {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println(quiz[i].getQuestion());
			answers[i]=Integer.parseInt(scan.nextLine());
		}
		scan.close();
	}
	
	/**
	 * grades the quiz
	 */
	public void gradeQuiz() {
		int res=0;
		for(int i=0;i<10;i++) {
			System.out.println(quiz[i].getQuestion());
			System.out.println("Your answer : "+answers[i]);
			if(answers[i]==quiz[i].getCorrectAnswer()) {
				res++;
				System.out.println("CORRECT");
			}
			else {
				System.out.println("INCORRECT");
			}
		}
		System.out.println("Your grade : "+res+"/10");
	}
	
	public static void main(String[] args) {
		EE57 test=new EE57();
		test.getAnswers();
		test.gradeQuiz();
	}
}
