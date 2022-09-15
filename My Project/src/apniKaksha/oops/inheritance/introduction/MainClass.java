package apniKaksha.oops.inheritance.introduction;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher obj = new Teacher();
		obj.name=" satyendra";
		Singer s = new Singer();
		s.name="oprah";
		obj.teach();
		obj.eat();
		obj.walk();
		s.sing();
		s.eat();
		s.walk();

	}

}
