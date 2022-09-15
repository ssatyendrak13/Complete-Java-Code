package javatPoint.string;

public class ToString {
	
	int rollNum; 
	String name;
	String city;
	ToString(int rollNum , String name , String city ){
		this.rollNum=rollNum;
		this.name=name;
		this.city=city;
	}
	public static void main(String args[]) {
		
		ToString ts = new ToString(10,"sattu","bhopal");
		ToString ts1= new ToString(11 , "satyendra","madhubani");
		System.out.println(ts);
		System.out.println(ts1);
		
	}
	public String toString() {
		return rollNum+" "+name+" "+city;
	}
	

}
