package ramaSoft.innerClass;

public class InterfaceInsideInterface {
	
	public static void main(String args[]){
		MyInterface1.TestClass objr=new MyInterface1.TestClass();
	    objr.testMethod1();
		}

}
interface MyInterface1{
	   interface InnerInter{
		   void testMethod(); //by defaul public abstract
	   }
	   //by default member of Inteface public static final
	   class TestClass implements InnerInter{
		  public void testMethod()
		  {
			   System.out.println("inteface--innerInterface---implements--TestClass Method");
		   }
		   void testMethod1(){
			   System.out.println("Static InnerClass Method called");
		   }
	   }

	}