package javatPoint.innerClasses.localInnerClass;

public class TestLocalInner {
	
	private int data = 50;
	
	void display() {
		
		class Local{
			
			void mag() {
				System.out.println(data);
			}
			
		}
		Local l = new Local();
		l.mag();
		
	}
	
	public static void main(String args[]) {
		
		TestLocalInner obj = new TestLocalInner();
		obj.display();
	}

}
