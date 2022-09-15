package javatPoint.oops.classAndObjects.constructors;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("default constructor is created right now ");
	}
	ConstructorOverloading(int n ){
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	ConstructorOverloading(int a , int b){
		if(a>b) {
			System.out.println(" a is greater value than b");
		}else {
			System.out.println("b is greater value than a");
		}
	}

	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading(10);
		ConstructorOverloading obj2  = new ConstructorOverloading(10,12);

	}

}
