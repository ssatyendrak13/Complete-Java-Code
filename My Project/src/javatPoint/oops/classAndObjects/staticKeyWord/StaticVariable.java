package javatPoint.oops.classAndObjects.staticKeyWord;

public class StaticVariable {

	public static void main(String[] args) {
		
		Test obj = new Test();
		Test obj1 = new Test();
		Test obj2 = new Test();
		obj.counter();
		obj1.counter();
		obj2.counter();

	}

}
class Test {
	
	static int count =0;
//	int count=0;
	void counter() {
		count++;
		System.out.println(count);
	}
}
