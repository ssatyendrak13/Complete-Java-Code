package ramaSoft.oops.inheritance;

public class SingleInheritance {
	
	public static void main(String args[]) {
		Subclass obj = new Subclass();
		obj.method4();
	}

}
class SuperClass{
	
	void method1() {
		System.out.println("method1 is calling ");
	}
	void method2() {
		System.out.println("method2 is calling ");
	}
	void method3() {
		System.out.println("method3 is calling ");
	}
	
}
class Subclass{
	void method4() {
		System.out.println("method4 is calling");
	}
}
