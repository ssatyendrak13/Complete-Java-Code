package roughWork.learnCoding;

public class Hello {
	
	 public void myMethod(){
		 System.out.println("Method");
	 }
	 {
		 System.out.println(" Instance Block");
	 }
	 public void First_C(){
		 System.out.println("Constructor ");
	 }
	 static{
		 System.out.println("static block");
	 
	 }
	 public static void main(String[] args){
		 Hello c = new Hello();
		 c.First_C();
		 c.myMethod();
	 } 

}
