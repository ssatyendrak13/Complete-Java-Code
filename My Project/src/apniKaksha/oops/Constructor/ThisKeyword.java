package apniKaksha.oops.Constructor;

class keyboard{
	int wheels;
	int headlights;
	String color;
	keyboard(int wheels , String color ){
		headlights=2;
		this.wheels=wheels;
		this.color=color;
		
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		
		keyboard obj=new keyboard(4, "yellow");
		System.out.println(obj.headlights+" headlights , "+obj.color+" color and "+obj.wheels+" wheels");
		
	}

}
