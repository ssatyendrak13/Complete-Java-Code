package ramaSoft.oops.inheritance;

public class MultilevelInheritance {
	
	  public static void main(String[] args) {
	        Derived1 objr1=new Derived1(); //which accessible by Derived1 object
	        Derived2 objr2=new Derived2(); //which accessible by Derived2object
	    }
	
	

}
class Base{
    void baseMethod()
    {
        System.out.println("Base Class method");
    }
}
class Derived1 extends Base{
    void derived1Method()
    {
        System.out.println("Derived1 classMethod ");
    }
}
class Derived2 extends Derived1{
    void derived2Method()
    {
        System.out.println("Derived2 class Method");
    }
}
