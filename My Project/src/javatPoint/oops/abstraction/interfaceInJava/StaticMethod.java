package javatPoint.oops.abstraction.interfaceInJava;

public class StaticMethod {
	
	public static void main(String args[]){  
		Drawable4 d=new Rectangle4();  
		Drawable4.draw();  
//		System.out.println(Drawable4.cube(3));  
		}
	

}
interface Drawable4{
	static void draw() {
		System.out.println("you can draw");
	}
}

class Rectangle4 implements Drawable4{  
	public void draw(){System.out.println("drawing rectangle");}  
}  
