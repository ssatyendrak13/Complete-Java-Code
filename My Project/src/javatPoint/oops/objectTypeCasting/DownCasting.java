package javatPoint.oops.objectTypeCasting;

public class DownCasting {
	
	public static void main(String args[]) {
		 Parent1 p = new Child1();
		 Child1 c = (Child1)p;
		 p.print();
	}

}
class Parent1{
	void print() {
		System.out.println("parent class is calling");
	}
}
class Child1 extends Parent1{
	void print() {
		System.out.println("child class is calling");
	}
}
