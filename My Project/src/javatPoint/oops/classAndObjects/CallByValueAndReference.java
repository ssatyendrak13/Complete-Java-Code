package javatPoint.oops.classAndObjects;

public class CallByValueAndReference {

	public static void main(String[] args) {
		
		Call obj = new Call();
		System.out.println(obj.data);
		obj.change(200);
		System.out.println(obj.data);

	}

}
class Call{
	int data = 50;
	void change(int n) {
		data = data +100;
	}
}
