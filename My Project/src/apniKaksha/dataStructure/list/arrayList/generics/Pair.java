package apniKaksha.dataStructure.list.arrayList.generics;

public class Pair<X , Y >{
	
	X x;
	Y y;

//	public Pair(String string, int i) {
//		// TODO Auto-generated constructor stub
//	}
//	public Pair(boolean b, String string) {
//		// TODO Auto-generated constructor stub
//	}
	public void Pair(X x , Y y) {
		this.x = x;
		this.y = y ;
	}
	public void getDescription() {
		System.out.println(x+"  and  "+y);
	}
	

	
}
