package apniKaksha.oops.Constructor;

class test{
	int wheels ;
	int headlights;
	String color;
	test(int wheels){
		this.wheels=wheels;
	}
	test(int headlights , String color){
		this.headlights=headlights;
		this.color=color;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		test car = new test(4);
		test car1=new test(2 , " white");
		System.out.println(car.wheels+"  wheels");
		System.out.println(car1.headlights+" headlights and "+car1.color+" color");
		

	}

}
