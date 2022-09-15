package javatPoint.collectionFrameWork.genericClass;

public class MyGenericClass1 {

	public static void main(String[] args) {
		
		MyGeneric1<String> g = new MyGeneric1();
		g.add("satu");
//		g.add("niru");
		System.out.println(g.get());

	}

}
class MyGeneric1<T>{
	private T t;

	public T get() {
		return t;
	}

	public void add(T t) {
		this.t = t;
	}
	
}
