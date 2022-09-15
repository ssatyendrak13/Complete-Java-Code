package javatPoint.collectionFrameWork.set.Hashset;

import java.util.HashSet;

public class HashSetExample2 {
	
	public static void main(String args[]) {
		
		HashSet<Book> hs = new HashSet<>();
		
		Book b1 = new Book(500 , 101 , "javabook1");
		Book b2 = new Book(600 , 102 , "javabook2");
		Book b3 = new Book(700 , 103 , "javabook3");
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		
		for(Book item : hs) {
			System.out.println(item.price+" price "+item.id+" id and "+item.name);
		}
	}

}
class Book {
	
	int price;
	int id;
	String name;
	
	Book(int price , int id , String name){
		this.price=price;
		this.id=id;
		this.name=name;
	}
	
}
