package javatPoint.oops.inheritance;

public class Multilevel {

	public static void main(String[] args) {
		
		Three t = new Three();
		t.print_geek();
		t.print_for();
		t.print_geek();

	}

}
class One{
	public void print_geek() {
		System.out.println("geeks");
	}
}
class Two extends One{
	public void print_for() {
		System.out.println("for");
	}
}
class Three extends Two{
	public void print_geek() {
		System.out.println("geeks");
	}
}
