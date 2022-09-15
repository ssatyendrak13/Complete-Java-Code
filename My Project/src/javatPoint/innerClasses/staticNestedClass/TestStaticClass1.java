package javatPoint.innerClasses.staticNestedClass;

public class TestStaticClass1 {
	
	private static int data = 50;
	
	class Inner{
		
		static void msg() {
			System.out.println("the data is "+data);
		}
		
	}
	public static void main(String args[]) {
		
		TestStaticClass1.Inner.msg();
		
	}

}
