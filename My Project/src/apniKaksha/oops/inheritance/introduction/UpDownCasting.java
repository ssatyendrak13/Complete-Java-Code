package apniKaksha.oops.inheritance.introduction;

public class UpDownCasting {

	public static void main(String[] args) {
		
//		Singer s =  new Singer();
//		Person p = s;
//		Teacher t = new Teacher();
//		Person p1 = t;
		
		Person p = new Person();
		Singer s = (Singer)p ; 
	}

}
