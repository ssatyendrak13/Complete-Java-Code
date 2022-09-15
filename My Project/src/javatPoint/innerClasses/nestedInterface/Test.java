package javatPoint.innerClasses.nestedInterface;

public class Test implements Showable.Message{

	public void msg() {
		System.out.println("hello nested interface ");
	}
	
	public static void main(String args[]) {
		Showable.Message m = new Test();
		m.msg();
	}
	

}
interface Showable{
	
	void show();
	
	interface Message{
		
		void msg();
	}
	
}