package javatPoint.oops.polymorphism.polymorphismTypes.runtime;

public class DataMember {

	public static void main(String[] args) {
		
		Bikes b = new Hondas();
		System.out.println(b.speed);
		
	}

}
class Bikes{
	int speed = 50;
}
class Hondas extends Bikes{
	
	int speed = 100;
}
