package javatPoint.collectionFrameWork.queue.arrayDeque;
import java.util.*;
public class BookTest {
	
	public static void main(String args[]) {
		
		Deque<Book> d = new ArrayDeque<>();
		
		Book b1 = new Book(500 , 101 , "javabook1");
		Book b2 = new Book(600 , 102 , "javabook2");
		Book b3 = new Book(700 , 103 , "javabook3");
		Book b4 = new Book(800 , 104 , "javabook4");
		
		d.add(b1);
		d.add(b2);
		d.add(b3);
		d.add(b4);
		for(Book item : d) {
			System.out.println(item.price+"  "+item.id+"    "+item.name);
		}
		
	}

}
class Book{
	
	int price;
	int id;
	String name;
	Book(int price , int id , String name){
		this.price=price;
		this.id=id;
		this.name=name;
	}
	
}
