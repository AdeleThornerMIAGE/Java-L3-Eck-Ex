package jarEE53;

import java.util.ArrayList;
import java.util.Scanner;

public class E1 {

	private ArrayList<Integer> set;
	
	public E1() {
		set=new ArrayList<Integer>();
		Scanner scn=new Scanner(System.in);
		int a=1;
		while(a!=0) {
			System.out.println("Rentrer un entier");
			a=Integer.parseInt(scn.nextLine());
			enter(a);
		}
		scn.close();
	}
	
	/**
	 * adds an integer to the set
	 * @param a
	 */
	public void enter(int a) {
		if(!set.contains(a)) {
			set.add(a);
		}
	}
	
	/**
	 * returns the string that represents the set
	 */
	public String toString() {
		String s="";
		for(int i=0;i<set.size()-1;i++) {
			s+=set.get(i)+" ; ";
		}
		s+=set.get(set.size()-1);
		return s;
	}
	
	/**
	 * returns true id the integer a is in the set
	 * @param a
	 * @return
	 */
	public boolean contains(Integer a) {
		return set.contains(a);
	}
	
	/**
	 * returns the element in the set at the position i
	 * @param i
	 * @return
	 */
	public int get(int i) {
		return set.get(i);
	}
	
	/**
	 * returns a new set with the union of the two sets
	 * @param set2
	 * @return
	 */
	public E1 union(E1 e) {
		E1 union=new E1();
		for(int i=0;i<set.size();i++) {
			union.enter(set.get(i));
		}
		for(int i=0;i<e.set.size();i++) {
			union.enter(e.set.get(i));
		}
		return union;
	}
	
	public static void main(String[] args) {
		E1 e1=new E1();
		E1 e2=new E1();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.union(e2));
	}
	
	
	
}
