package apniKaksha.oops.Constructor;

class vehical{
	int wheels;
	int headlights;
	vehical(){
		wheels=4;
		headlights=2;
		
	}
}
public class NoArgumentsConstructor {

	public static void main(String[] args) {
		vehical car=new vehical();
		System.out.println(car.wheels+"  "+car.headlights);
		
	}

}
