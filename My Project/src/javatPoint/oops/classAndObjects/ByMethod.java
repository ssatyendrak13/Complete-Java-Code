package javatPoint.oops.classAndObjects;

public class ByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method2 m = new Method2();
		m.customer(101, "satyendra");
		m.display();
		

	}

}
class Method2{
	int id;
	String name;
	
	void customer(int roll , String obj) {
		id = roll;
		name = obj;
	}
	void display() {
		System.out.println(id+"   "+name);
	}
}
