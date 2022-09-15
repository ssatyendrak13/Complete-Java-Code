package javatPoint.oops.classAndObjects.constructors;

public class CopyValueWithoutConstructor {

	public static void main(String[] args) {
		
		Students s = new Students(100 , "satyendra");
		Students s1 = new Students();
		s1.id=s.id;
		s1.name=s.name;
		s.display();
		s1.display();
		

	}

}
class Students{
	
	int id;
	String name;
	Students(int n , String s){
		id=n;
		name=s;
	}
	Students(){};
	void display() {
		System.out.println(id+" is id and name is "+name);
	}
	
}
