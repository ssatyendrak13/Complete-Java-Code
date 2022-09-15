package apniKaksha.dataStructure.hashcode;

public class mainClass {
	
	public static void main(String args[]) {
	
		Pencil pen1 =  new Pencil(10 , "blue");
		Pencil pen2 = new Pencil(10 , " blue");
		
		System.out.println(pen1==pen2);
		System.out.println(pen1.equals(pen2));
	}
	
}
class Pencil {
	int price;
	String color;
	
	public Pencil(int price , String color) {
		this.price=price;
		this.color=color;
	}
}
