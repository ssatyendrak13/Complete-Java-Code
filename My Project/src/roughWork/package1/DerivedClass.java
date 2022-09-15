package roughWork.package1;

public class DerivedClass extends SameClass{
	private int n=10;
	DerivedClass(){
		super();
		System.out.println("derived class constructro ");
	}
	public static void main(String[] args) {
		new DerivedClass();
	}
}
