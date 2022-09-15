package codingNinjas.datastructure.linkedList2;

import java.util.Scanner;

public class MergeTwoSortedLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first linkedList");
		Node<Integer> head1 = takeInput();
		System.out.println("enter the second linkdeList");
		Node<Integer> head2 = takeInput();
		Node<Integer> ans = merge(head1 , head2 );
		print(ans);
	}
	
	public static void print(Node<Integer> head ) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> merge(Node<Integer> head1 , Node<Integer> head2 ){
	
		Node<Integer> p1 = head1;
		Node<Integer> p2 = head2;
		Node<Integer> dummyNode = new Node<Integer>(-1);
		Node<Integer> p3 = dummyNode;
		while(p1 != null && p2 != null) {
			
			if(p1.data<p2.data) {
				p3.next=p1;
				p1 = p1.next;
				p3=p3.next;
			}else {
				p3.next=p2;
				p2 = p2.next;
				p3=p3.next;
			}
		}
		while(p1 != null) {
			p3.next=p1;
			p1=p1.next;
			p3=p3.next;
		}
		while(p2 != null) {
			p3.next=p2;
			p2=p2.next;
			p3=p3.next;
		}
		return dummyNode.next;
	}
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null , tail = null;
		Scanner sc  = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head  = newNode;
				tail  = newNode;
			}else {
				tail.next=newNode;
				tail= newNode;
			}
			data = sc.nextInt();
		}
		return head;
	}

}
