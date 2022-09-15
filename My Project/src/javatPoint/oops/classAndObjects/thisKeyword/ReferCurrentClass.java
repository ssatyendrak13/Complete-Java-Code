package javatPoint.oops.classAndObjects.thisKeyword;

public class ReferCurrentClass {

	public static void main(String[] args) {
		
		Main obj = new Main(100 , "satyendra");
		System.out.println(obj.id+" is id and name is "+obj.name);
	}

}
class Main{
	
	int id ;
	String name;
	Main(int id , String name){
		this.id=id;
		this.name=name;
	}
	
}
