package javatPoint.oops.polymorphism.superKeyword;

public class InstanceVariable {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.printColor();

	}

}
class Animal{
	String color = "black";
}
class Dog extends Animal{
	String color ="white";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}