package javatPoint.exceptionHandling.throwKeyWord;

public class Testthrow1 {
	
	 public static void main(String args[])  
	    {  
	        try  
	        {  
	            // throw an object of user defined exception  
	            throw new UserDefinedException("This is user-defined exception");  
	        }  
	        catch (UserDefinedException ude)  
	        {  
	            System.out.println("Caught the exception");  
	            // Print the message from MyException object  
	            System.out.println(ude.getMessage());  
	        }  
	    }  

}
class UserDefinedException extends Exception {
	
	UserDefinedException(String s){
		super(s);
	}
	
}
