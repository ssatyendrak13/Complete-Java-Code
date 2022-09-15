package javatPoint.oops.polymorphism;

public class InitializerBlock {

	public static void main(String[] args) {
		
		Dog3 d = new Dog3();

	}

}
class Animal3{
	Animal3(){
		System.out.println("parents class constructor is involked");
	}
}
class Dog3 extends Animal3{
	Dog3(){
		System.out.println("child class constructor is involked");
	}
	{
		System.out.println("intializer block is involked");
	}
}
