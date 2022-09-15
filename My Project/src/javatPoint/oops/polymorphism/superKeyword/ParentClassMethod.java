package javatPoint.oops.polymorphism.superKeyword;

public class ParentClassMethod {

	public static void main(String[] args) {
		
		Dog1 d = new  Dog1();
		d.work1();

	}

}
class Animal1{
	void eat() {
		System.out.println("eating");
	}
}
class Dog1 extends Animal1{
	void eat() {
		System.out.println("eating bread...");
	}
	void bark() {
		System.out.println("barking....");
	}
	void work1() {
		super.eat();
		bark();
	}
}
