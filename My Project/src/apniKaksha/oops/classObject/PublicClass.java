package apniKaksha.oops.classObject;

class cat{
	boolean hasfur;
	String color,bread;
	int legs,eyes;
	public void walk() {
		System.out.println("cat is walking ");
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void discription() {
		System.out.println("my cat has "+legs+" legs and "+eyes+" eyes");
	}
}
//class dog{
	
	
//}
public class PublicClass {

	public static void main(String[] args) {
		
		cat cat1 = new cat();
		cat cat2 = new cat();
		cat cat3 = new cat();
		cat cat4 = new cat();
		
		cat1.legs = 4;
		cat1.eyes = 6;
		cat2.legs = 3;
		cat2.eyes = 2;
		cat1.discription();
		cat2.discription();

	}

}
