package apniKaksha.oops.inheritance.superKeyword;

public class student extends person {
	
	public void read() {
		System.out.println("student is reading ");
	}
	public void walk() {
		super.walk(); 
		System.out.println(" sattu is walking ");
	}

}
