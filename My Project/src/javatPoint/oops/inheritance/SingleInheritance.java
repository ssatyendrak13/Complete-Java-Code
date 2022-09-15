package javatPoint.oops.inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		
		Dog g = new Dog();
		g.eat();
		g.bark();

	}

}
class Animal{
	public void eat() {
		System.out.println("eating ");
	}
}
class  Dog extends Animal{
	public void bark() {System.out.println("barking");}
}
