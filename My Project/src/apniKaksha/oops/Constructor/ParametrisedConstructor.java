package apniKaksha.oops.Constructor;

class van{
	int wheels;
	int headlights;
	String color;
	van(int noOfwheels){
		wheels=noOfwheels;
		headlights=2;
	}
}

public class ParametrisedConstructor {

	public static void main(String[] args) {
		van car=new van(4 );
		van scooty=new van(2);
		System.out.println(car.wheels+"  "+car.headlights);
		
	}

}
