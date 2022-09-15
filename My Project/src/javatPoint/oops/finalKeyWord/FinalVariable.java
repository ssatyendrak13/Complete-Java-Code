package javatPoint.oops.finalKeyWord;

public class FinalVariable {
	
	final int speedLimit  = 100;
	void change() {
//		speedLimit= 200;  // it will throw compile time error
	}

	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		obj.change();
		System.out.println(obj.speedLimit);

	}

}
