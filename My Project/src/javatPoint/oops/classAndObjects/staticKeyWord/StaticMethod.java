package javatPoint.oops.classAndObjects.staticKeyWord;

public class StaticMethod {
	
	int id;
	String name;
	static String coll;
	
	StaticMethod(int n , String s){
		id=n;
		name=s;
	}
	static void change() {
		coll="technocrats";
				
	}
	void display() {
		System.out.println(id+" is id and name is "+name+" and college name is "+coll);
	}

	public static void main(String[] args) {
		StaticMethod obj = new StaticMethod(100,"satyendra");
		obj.change();
		obj.display();
	}

}
