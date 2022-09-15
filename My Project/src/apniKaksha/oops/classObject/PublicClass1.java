package apniKaksha.oops.classObject;

class sattu{
	boolean hasfur;
	String color,bread;
	int legs,hand,eyes;
	public void walk() {
		System.out.println("satyendra is walking");
	}
	public void eat() {
		System.out.println("satyendra is eating");
	}
	public void discription() {
		System.out.println("satyendra has "+legs+" legs and "+eyes+" eyes");
	}
}

public class PublicClass1 {

	public static void main(String[] args) {
		
		sattu sattu1 = new sattu();
//		sattu sattu2 = new sattu();
//		sattu sattu3 = new sattu();
		
		sattu1.legs=2;
		sattu1.eyes=2;
		
		sattu1.walk();
		sattu1.eat();
		sattu1.discription();

	}

}
