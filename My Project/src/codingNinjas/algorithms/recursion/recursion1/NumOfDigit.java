package codingNinjas.algorithms.recursion.recursion1;

public class NumOfDigit {

	public static void main(String[] args) {
		System.out.println(count(235));

	}
	public static int count(int n) {
		if(n<10) {
			return 1;
		}
		return 1+count(n/10);
	}

}
