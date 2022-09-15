package apniKaksha.oops.polymorphism.compiletime;

public class MainClass {

	public static void main(String[] args) {
		
		greeting("sattu" , 5);

	}
	
	public static void greeting() {
		System.out.println();
	}
	public static void greeting (String s ) {
		System.out.println(s);
	}
	public static void greeting(String s , int count ) {
		for(int i=0; i<count ; i ++) {
			System.out.println(s);
		}
	}

}
