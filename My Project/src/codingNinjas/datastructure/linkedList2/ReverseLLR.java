package codingNinjas.datastructure.linkedList2;

import java.util.Scanner;

public class ReverseLLR {
	
	public static void main(String args[]) {
		
		Node<Integer> head = takeInput();
		Node<Integer> ans = reverseLLR(head);
		print(ans);
	}
	
	public static Node<Integer> reverseLLR(Node<Integer> head){
		
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> reverseTail = head.next;
		Node<Integer> smallHead = reverseLLR(head.next);
		reverseTail.next = head; 
		head.next=null;
		return smallHead;
		
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
