package javatPoint.innerClasses.annonymousInnerClass;

public class TestUsingClass {
	
	public static void main(String args[]) {
		
		Student s = new Student() {

			@Override
			void eat() {
				
				System.out.println("students are eating ");
				
			}
		};
		s.eat();
	}

}
abstract class Student{
	
	abstract void eat();
	
}
