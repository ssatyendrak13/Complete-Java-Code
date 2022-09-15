package javatPoint.oops.classAndObjects;

public class Abstract extends Demo{
	
	void display() {
		System.out.println("abstrat method");
	}
	public static void main(String args[]) {
		Demo obj = new Abstract();
		obj.display();
	}

}
abstract class Demo{
	
	abstract void display();
	
}
