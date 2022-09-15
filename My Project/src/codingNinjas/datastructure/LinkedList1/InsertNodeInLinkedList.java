package codingNinjas.datastructure.LinkedList1;

import java.util.Scanner;

public class InsertNodeInLinkedList {
	
	public static void main(String args[]) {
		
		Node<Integer> head = takeInput();
		head = insertNode(head , 80 , 0);
		print(head);
	}
	
	public static Node<Integer> insertNode(Node<Integer> head , int data , int pos) {
		
		Node<Integer> newNode = new Node<>(data);
		int i=0;
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}
		Node<Integer> temp = head;
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
		
	}
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head =  null , tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head=newNode;
				tail = newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			data =sc.nextInt();
			
		}
		return head;
		
	}
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

}
