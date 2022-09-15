package javatPoint.oops.classAndObjects.constructors;

public class ParametrizedConstructors {
	
	int id;
	String name;
	ParametrizedConstructors(int roll , String naam){
		id = roll;
		name = naam;
	}
	
	public static void main(String args[]) {
		ParametrizedConstructors obj = new ParametrizedConstructors(101 , "satyendra");
		System.out.println(obj.id+" is id and name is "+obj.name);
	}

}
