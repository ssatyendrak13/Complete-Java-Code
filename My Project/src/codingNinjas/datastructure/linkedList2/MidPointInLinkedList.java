package codingNinjas.datastructure.linkedList2;

import java.util.Scanner;

public class MidPointInLinkedList {

	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		System.out.println(findMidOther(head).data);

	}
	
	
	public static int length(Node<Integer> head) {
		int len = 0;
		Node<Integer> temp = head;
		while(temp!= null) {
			temp = temp.next;
			len++;
		}
		return  len;
	}
	public static Node<Integer> findMidOther(Node<Integer> head) {
		if(head == null) {
			return head;
		}
		Node<Integer> s = head;
		Node<Integer> f = head;
		while(f.next != null && f.next.next != null) {
			s = s.next;
			f = f.next.next;
		}
		return s;
		
	}
	// first method to find mid point in linkedList
	public static void findMid(Node<Integer> head){

		int mid = length(head)/2;
		int val = length(head);
		Node<Integer> temp = head;
		while(mid-1>0) {
			temp = temp.next;
			mid--;
		}
		if(val%2==0) {
			System.out.println(temp.data);
		}else {
			System.out.println(temp.next.data);
		}
		
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
