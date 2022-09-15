package apniKaksha.algorithms.recursion;

public class RaisedPower {
	static int stepCount=0;
	public static void main(String args[]) {
		
		System.out.println(pow(3,5));
		System.out.println(pow(1,10000));
		System.out.println("steps "+stepCount);
		
	}
	static int pow(int a  , int b) {
		stepCount++;
		if(b==0) {
			return 1;
		}
		return a*pow(a , b-1);
	}

}
