package javatPoint.oops.objectTypeCasting;

public class Upcasting {
	
	public static void main(String args[]) {
		Parent p = new Child();
		p.printData();
	}

}
class Parent{
	
	void printData() {
		System.out.println("parents class is called");
	}
	
}
class Child extends Parent{
	void printData() {
		System.out.println("child class is called");
	}
}
