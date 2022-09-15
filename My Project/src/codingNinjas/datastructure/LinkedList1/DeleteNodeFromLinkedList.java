package codingNinjas.datastructure.LinkedList1;
import java.util.*;
public class DeleteNodeFromLinkedList {

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> ans = deleteNode(head , 1);
		print(ans);

	}
	
	public static void print(Node<Integer> head ) {
		
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
		
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head , int pos) {
		
		int i=0;
		Node<Integer> temp = head;
		if(pos==0) {
			head = temp.next;
			return head;
		}
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		temp.next=temp.next.next;
		return head;
		
	}
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null , tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head==null) {
				head = newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
				
			}
			data = sc.nextInt();
		}
		return head;
		
	}

}
