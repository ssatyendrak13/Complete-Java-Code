package codingNinjas.datastructure.linkedList2;

import java.util.Scanner;

public class ReverseLLBetter {

	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		DoubleNode ans = reverseLL(head);
		print(ans.head);
		
	}
	
	public static DoubleNode reverseLL(Node<Integer> head){
		
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head= head;
			ans.tail= head;
			return ans;
		}
		DoubleNode smallAns = reverseLL(head.next);
		smallAns.tail.next = head;
		head.next=null;
		DoubleNode ans = new DoubleNode();
		ans.head=smallAns.head;
		ans.tail=head;
		return ans;
		
		
	}
	
	public static void print(Node<Integer> head) {
		
		while(head!=null) {
			System.out.print(head.data+" ");
			head =  head.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null , tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	

}

class DoubleNode{
	
	Node<Integer> head;
	Node<Integer> tail;
	
}












