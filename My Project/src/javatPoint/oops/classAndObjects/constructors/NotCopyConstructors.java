package javatPoint.oops.classAndObjects.constructors;

public class NotCopyConstructors {
	int id ;
	String s;
	NotCopyConstructors(int n , String name ){
		id=n;
		s=name;
	}
	NotCopyConstructors(NotCopyConstructors str){
		id=str.id;
		s=str.s;
	}
	void display() {
		System.out.println(id+" is id and name is "+s);
	}
	public static  void main(String args[]) {
		
		NotCopyConstructors obj = new NotCopyConstructors(101 , "sattu");
		NotCopyConstructors obj1 = new NotCopyConstructors(obj);
		obj.display();
		obj1.display();
		
	}

}
