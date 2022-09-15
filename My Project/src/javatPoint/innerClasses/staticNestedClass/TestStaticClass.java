package javatPoint.innerClasses.staticNestedClass;

public class TestStaticClass {
	
	static int data = 50;
	
	static class Inner {
		
		void msg() {
			System.out.println("data is "+data);
		}
		
	}
	
	public static void main(String args[]) {
		
//		TestStaticClass obj = new TestStaticClass();
		TestStaticClass.Inner obj = new TestStaticClass.Inner();
		obj.msg();
		
	}

}
