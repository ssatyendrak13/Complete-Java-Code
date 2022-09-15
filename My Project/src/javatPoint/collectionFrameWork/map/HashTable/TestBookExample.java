package javatPoint.collectionFrameWork.map.HashTable;
import java.util.*;
public class TestBookExample {

	public static void main(String[] args) {
		
		Hashtable<Integer , Book1> map = new Hashtable<>();
		Book1 b1 = new Book1(101 , "javabook" , 500);
		Book1 b2 = new Book1(102 , "javabook" , 600);
		Book1 b3 = new Book1(103 , "javabook" , 700);
		Book1 b4 = new Book1(104 , "javabook" , 800);
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		map.put(4, b4);
		
		for(Map.Entry item : map.entrySet()) {
			int k = (int) item.getKey();
			Book1 b = (Book1) item.getValue();
			System.out.println(b.id+" "+b.name+" "+b.price);
		}

}
}
class Book1{
	
	
	int id;
	String name;
	int price;
	Book1(int id , String name , int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
