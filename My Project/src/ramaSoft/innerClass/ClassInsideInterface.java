package ramaSoft.innerClass;

public class ClassInsideInterface {
	
	public static void main(String args[]){
		MyInterface.TestClass objr=new MyInterface.TestClass();
	    objr.testMethod1();
	}

}
interface MyInterface{

	   //by default member of Inteface public static final
	   class TestClass{
		   void testMethod1(){
			   System.out.println("Static InnerClass Method called");
		   }
	   }

	}
