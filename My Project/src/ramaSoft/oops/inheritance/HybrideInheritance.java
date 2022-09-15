package ramaSoft.oops.inheritance;

public class HybrideInheritance {
	
	public static void main(String[] args) {
        Derived11 objr11=new Derived11(); //which accessible by Derived1 object
        Derived22 objr22=new Derived22(); //which accessible by Derived2object
        objr11.baseMethod();
        objr11.derived1Method();
        objr22.baseMethod();
        objr22.derived2Method();
        Derived33 objr3=new Derived33();
        objr3.baseMethod();
        objr3.derived2Method();
        objr3.derived3Method();
    }

}
class Base1{
    void baseMethod()
    {
        System.out.println("Base Class method");
    }
}
class Derived11 extends Base1{
    //baseMethod()
    void derived1Method()
    {
        System.out.println("Derived1 classMethod ");
    }
}
class Derived22 extends Base1{
    //baseMethod()
    void derived2Method()
    {
        System.out.println("Derived2 class Method");
    }
}
class Derived33 extends Derived22{
    void derived3Method()
    {
        System.out.println("Derived3 Class method");
    }
}
