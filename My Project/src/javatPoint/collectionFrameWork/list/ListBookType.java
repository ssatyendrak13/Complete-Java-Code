package javatPoint.collectionFrameWork.list;
import java.util.*;
public class ListBookType {

	public static void main(String[] args) {
		Book b1 = new Book(100,"java","javapublicer");
		Book b2 = new Book(200,"python","pythonpublicer");
		
		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		for(Book item : list) {
			System.out.println("price of book is "+item.price+" name of book is "
		+item.name+" and publicer of boook is "+item.publicer);
		}

	}

}
class Book{
	int price;
	String name;
	String publicer;
	Book(int price , String name , String publicer){
		this.price=price;
		this.name=name;
		this.publicer=publicer;
	}
}
