package ramaSoft.innerClass;

public class Main {
	
	public static void main(String args[]) {
		
		 //inner class object
	    /*                                      //local innerClass object(Instance level)
	    OutterClass.InnerClass inobjr=new OutterClass().new InnerClass();
	    */
		//new OuterClassName.InnerClassConstructor();
	    outerClass.StaticInnerClass inobjr=new outerClass.StaticInnerClass();
	    inobjr.testMethod2();
	}
	

}
class outerClass{
	
	void testMethod() {
		
		System.out.println("outer class method called");
	}
	static class StaticInnerClass{
		void testMethod2() {
			System.out.println("static innerClass method called");
		}
	}
	
}
