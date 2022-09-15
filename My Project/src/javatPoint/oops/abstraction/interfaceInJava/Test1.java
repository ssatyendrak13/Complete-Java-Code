package javatPoint.oops.abstraction.interfaceInJava;

public class Test1 implements printable1 , showable {
	
	public void print() {
		System.out.println("hello");
	}
	public  void show() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.print();
		t.show();
	}

}
interface printable1{
	void print();
}
interface showable{
	void show();
}
