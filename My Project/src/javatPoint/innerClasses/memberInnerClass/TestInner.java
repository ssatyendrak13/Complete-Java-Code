package javatPoint.innerClasses.memberInnerClass;

public class TestInner {
	
	private int data = 80;
	
	class Inner{
		
		void msg() {
			System.out.println("the value of data is "+data);
		}
		
	}
	
	public static void main(String args[]) {
		
		TestInner obj = new TestInner();
		
		TestInner.Inner in = obj.new Inner();
		
		in.msg();
			
	}

}
