package codingNinjas.algorithms.recursion.recursion1;

public class CalculatePower {
	
	public static void main(String args[]) {
		System.out.println(pow(2,5));
	}
	
	public static int pow(int a , int b) {
		if(b==0) {
			return 1;
		}
		return a*pow(a , b-1);
	}

}
