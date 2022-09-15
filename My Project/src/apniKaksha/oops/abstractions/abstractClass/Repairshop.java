package apniKaksha.oops.abstractions.abstractClass;

public class Repairshop {
	
	public static void RepairCar (Car car) {
		System.out.println("car is rapaired ");
	}
	public static void main(String[] args) {
		
		WagonR wagonr = new WagonR();
		Audi audi = new Audi();
		
		RepairCar(wagonr);
		RepairCar(audi);
		

	}

}
