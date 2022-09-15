package javatPoint.oops.classAndObjects;

public class ByRefrenceVariable {
	

	public static void main(String[] args) {
		
		Method1 s = new Method1();
		s.id=101;
		s.name="satyendra";
		System.out.println(s.id+"   "+s.name);

	}

}
class Method1{
	int id;
	String name;
}
