package javatPoint.innerClasses.nestedInterface;

public class Test1 implements A.Message{
	
	public void msg() {
		System.out.println("interface inside the class");
	}
	
	public static void main(String args[]) {
		
		A.Message m = new Test1();
		m.msg();
		
	}
	

}
class A {
	
	interface Message{
		
		void msg();
	}
}
