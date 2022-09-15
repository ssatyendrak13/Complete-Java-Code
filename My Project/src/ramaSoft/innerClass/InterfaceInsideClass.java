package ramaSoft.innerClass;

public class InterfaceInsideClass {
	
	public static void main(String args[]) {
		
		//inner class object
	    OutterClass.MyInterface inobjr=new OutterClass().new InnerClass();
	    //new OuterClassName.InnerClassConstructor();
	   // OutterClass.StaticInnerClass inobjr=new OutterClass.StaticInnerClass();
	    inobjr.testMethod2();
	  //  inobjr.testMethod3();
		
	}

}
class OutterClass
{
	//class level Shared
	void testMethod1()
	{
		System.out.println("Outter class method called");
	}
	  interface MyInterface{
		  void testMethod2(); //by default ===public abstract testMethod2()
	  }
	  class InnerClass implements MyInterface{

		 //error void testMethod2()
		 public void testMethod2() //ok
		  {
		      System.out.println("InnerClass(implementation) ----Myinterface---abs method");
		  }
		  void testMethod3()
		  {
			  System.out.println("InnerClass self method");
		  }
	  }

}
