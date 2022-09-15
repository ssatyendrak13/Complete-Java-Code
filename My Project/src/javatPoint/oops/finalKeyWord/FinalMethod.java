package javatPoint.oops.finalKeyWord;

public class FinalMethod {

	public static void main(String[] args) {
		
		Honda obj = new Honda();
		obj.run();

	}

}
class Bike{
	
	final void run() {
		System.out.println("bike is running");
	}
	
}
class Honda extends Bike{
//	void run() {
//		System.out.println("honda is running"); /*this method will throw compile time error*/
//	}
}
