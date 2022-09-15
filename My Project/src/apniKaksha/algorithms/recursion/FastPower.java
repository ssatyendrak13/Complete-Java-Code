package apniKaksha.algorithms.recursion;

public class FastPower {
	static int stepCount = 0;
	public static void main(String args[]) {
		
		System.out.println(pow(3,10000));
		System.out.println("steps "+stepCount);
		
		stepCount=0;
		System.out.println(FastPow(3,10000));
		System.out.println("steps "+stepCount);
		
	}
	static int pow(int a , int b) {
		stepCount++;
		if(b==0) {
			return 1;
		}
		return a*pow(a, b-1);
	}
	static int FastPow(int a, int b) {
		stepCount++;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return FastPow(a*a, b/2);
		}
		return b;
	}

}
