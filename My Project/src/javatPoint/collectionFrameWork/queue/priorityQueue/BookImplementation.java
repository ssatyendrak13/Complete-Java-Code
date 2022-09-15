package javatPoint.collectionFrameWork.queue.priorityQueue;
import java.util.*;
public class BookImplementation {

	public static void main(String[] args) {
		
		PriorityQueue<Book> book = new PriorityQueue<Book>();
		Book  b1 = new Book(100 , "java" , "javaPublication1");
		Book  b2 = new Book(101 , "java" , "javaPublication2");
		Book  b3 = new Book(102 , "java" , "javaPublication3");
		Book  b4 = new Book(103 , "java" , "javaPublication4");
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		for(Book item : book) {
			System.out.println(item.id+"  "+item.name+"   "+item.publicer);
		}
	}

}
class Book implements Comparable<Book>{
	
	int id;
	String name;
	String publicer;
	
	Book(int id , String name , String publicer){
		this.id=id;
		this.name=name;
		this.publicer=publicer;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	public int compareTo(Book b) {  
//	    if(id>b.id){  
//	        return 1;  
//	    }else if(id<b.id){  
//	        return -1;  
//	    }else{  
//	    return 0;  
//	    }  
//	}
	
}
