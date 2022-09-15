package javatPoint.oops.abstraction.interfaceInJava;

public class Test2 implements Showable2 {
	
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  
	  
	public static void main(String args[]){  
	Test2 obj = new Test2();  
	obj.print();  
	obj.show();  
	 }  

}
interface Printable2{  
void print();  
}  
interface Showable2 extends Printable2{  
void show();  
}  
