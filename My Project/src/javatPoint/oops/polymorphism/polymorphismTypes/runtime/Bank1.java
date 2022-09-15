package javatPoint.oops.polymorphism.polymorphismTypes.runtime;

public class Bank1 {

	public static void main(String[] args) {
		
		bank b ;
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
		

	}

}
class bank {
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends bank{  
float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends bank{  
float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends bank{  
float getRateOfInterest(){return 9.7f;}  
}  
