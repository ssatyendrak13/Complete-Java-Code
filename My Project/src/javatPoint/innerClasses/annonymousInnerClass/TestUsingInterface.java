package javatPoint.innerClasses.annonymousInnerClass;

public class TestUsingInterface {
	
	public static void main(String args[]) {
		
		Eatable e = new Eatable() {
			
			public void eat() {
				System.out.println("eatable public are eating");
			}
			
		};
		e.eat();
		
	}

}
interface Eatable{
	
	void eat();
	
}