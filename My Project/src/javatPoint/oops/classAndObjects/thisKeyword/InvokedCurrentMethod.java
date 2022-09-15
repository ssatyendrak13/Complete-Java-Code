package javatPoint.oops.classAndObjects.thisKeyword;

public class InvokedCurrentMethod {

	public static void main(String[] args) {
		
		Main1 m = new Main1();
		m.n();

	}

}
class Main1{
	int id;
	String name;
	
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		this.m();
	}
	
}
