package javatPoint.collectionFrameWork.genericClass;

public class MyGenericClass {
	
	public static void main(String args[]) {
		MyGeneric<String> obj = new MyGeneric("this is my generic class");
		String str = obj.getT1();
		System.out.println(str);
	}

}
class MyGeneric<T1> {
	private T1 t1;
	
	MyGeneric(T1 t1 ){
		this.t1=t1;

	}

	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	
	
}
