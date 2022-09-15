package javatPoint.oops.abstraction;

public class Honda extends Bike {
	
	void run() {
		System.out.println("bike is running safely");
	}
	public static void main(String args[]) {
		Bike b = new Honda();
		b.run();
	}

}
abstract class Bike {
	abstract void run();
}
