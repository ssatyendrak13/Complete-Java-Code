package codingNinjas.datastructure.LinkedList1;

public class Node<T> {

	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
		next=null;
	}
}
