package codingNinjas.algorithms.recursion.recursion1;

public class PrintNumber {
	
	public static void main(String args[]) {
		printNum(5);
	}
	
	public static void printNum(int n) {
		if(n==0) {
			return ;
		}
		printNum(n-1);
		System.out.println(n);
	}

}
