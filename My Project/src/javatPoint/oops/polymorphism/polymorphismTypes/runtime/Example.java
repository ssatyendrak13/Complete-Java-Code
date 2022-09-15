package javatPoint.oops.polymorphism.polymorphismTypes.runtime;

public class Example {

	public static void main(String[] args) {
		
		Bike b = new Splendor();
		b.run();

	}

}
class Bike{
	void run() {
		System.out.println("running");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("running safely with 600 km");
	}
}
