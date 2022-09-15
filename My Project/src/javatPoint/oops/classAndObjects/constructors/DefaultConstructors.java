package javatPoint.oops.classAndObjects.constructors;

public class DefaultConstructors {
	
	int id;
	String name;
	
	DefaultConstructors(){
		System.out.println(name+"  name and id number is "+id);
	}
	
	public static void main(String args[]) {
		DefaultConstructors obj = new DefaultConstructors();
	}
}

