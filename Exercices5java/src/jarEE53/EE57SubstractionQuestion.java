package jarEE53;

public class EE57SubstractionQuestion implements EE57IntQuestion{

    private int a, b;  // The numbers in the problem.

    public EE57SubstractionQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
        if(a<b) {
        	int temp=a;
        	a=b;
        	b=temp;
        }
    }

    public String getQuestion() {
        return "What is " + a + " - " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a - b;
    }
}
