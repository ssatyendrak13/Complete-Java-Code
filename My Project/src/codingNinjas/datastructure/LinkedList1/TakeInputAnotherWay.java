package codingNinjas.datastructure.LinkedList1;

import java.util.Scanner;

public class TakeInputAnotherWay {
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head=head.next;
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

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);

	}

}
