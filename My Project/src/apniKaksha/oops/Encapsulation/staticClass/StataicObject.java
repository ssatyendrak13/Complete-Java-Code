package apniKaksha.oops.Encapsulation.staticClass;

//import oops.Encapsulation.staticClass.A.B;

public class StataicObject {

	public static void main(String[] args) {
		
		A objA = new A();
		A.B objB = objA.new B ();
		
		A.C objC = new A.C();
	}

}
