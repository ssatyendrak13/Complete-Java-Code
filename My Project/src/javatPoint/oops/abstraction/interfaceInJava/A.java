package javatPoint.oops.abstraction.interfaceInJava;

public class A implements printable {
	
	public void print() {
		System.out.println("hello");
	}
	public static void main(String args[]) {
		A a = new A();
		a.print();
	}

}
interface printable{
	void print();
}
