package javatPoint.exceptionHandling;

public class NestedTryCatch {
	
	public static void main(String args[]) {
		
		try {
			try {
				try {
					int a[] = {1,2,3,4};
					System.out.println(a[10]);
				}catch(ArithmeticException e) {
					System.out.println("arithmetic exception ");
					System.out.println("inner try bock 2");
				}
			}catch(ArithmeticException e) {
				System.out.println("arithmetic exception");
				System.out.println("inner try  1");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("outer main try block");
			
		} catch (Exception e5) {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
		
	}

}
