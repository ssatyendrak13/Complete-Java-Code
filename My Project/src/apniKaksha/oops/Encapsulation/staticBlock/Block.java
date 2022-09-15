package apniKaksha.oops.Encapsulation.staticBlock;

public class Block {
	
	static {
		System.out.println(" you are in block 1 ");
	}
	static {
		System.out.println(" you are  in block 2 ");
	}

	public static void main(String[] args) {
		
		System.out.println(" you are inside public static void main ");
		

	}
	static {
		
		System.out.println(" you are inside the third block ");
	}

}
