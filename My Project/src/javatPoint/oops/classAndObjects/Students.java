package javatPoint.oops.classAndObjects;

public class Students {
	
	int id;
	String name;

	public static void main(String[] args) {
		
		Students s =  new Students();
		System.out.println(s.id);
		System.out.println(s.name);
		
		Helper h = new Helper();
		System.out.println(h.rollNum);
		System.out.println(h.nameStu);

	}

}
class Helper{
	int rollNum;
	String nameStu;
}
