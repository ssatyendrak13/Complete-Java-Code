package codingNinjas.algorithms.recursion.recursion1;

public class FiboncciNumber {
	
	public static void main(String args[]) {
		System.out.println(fib(6));
	}
	
	public static int fib(int n) {
		if(n==0 || n==1 ) {
			return n; 
		}
		return fib(n-1) + fib(n-2);
	}

}
