package javatPoint.oops.classAndObjects;

public class ByConstructure {
	
	int id;
	String name;
	ByConstructure(int r , String n){
		id=r;
		name = n;
	}

	public static void main(String[] args) {
		
		ByConstructure obj = new ByConstructure(101 , "sattu");
		System.out.println(obj.id+"  "+obj.name);

	}

}
