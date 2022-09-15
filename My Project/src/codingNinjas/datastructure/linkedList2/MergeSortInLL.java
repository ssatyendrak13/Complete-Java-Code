package codingNinjas.datastructure.linkedList2;
import java.util.*;
public class MergeSortInLL {
	
	public static void main(String args[]) {
		
		Node<Integer> head = takeInput();
//		System.out.println(findMid(head).data);
		Node<Integer> ans = mergeSort(head);
		print(ans);
		
	}
	
	public static void print(Node<Integer> head) {
		
		while(head!=null) {
			System.out.print(head.data+" ");
			head =  head.next;
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
	
	 public static Node<Integer> mergeSort(Node<Integer> head)
	    {
	        // Base case : if head is null
	        if (head == null || head.next == null) {
	            return head;
	        }
	 
	        // get the middle of the list
	        Node<Integer> middle = findMid(head);
	        Node<Integer> nextofmiddle = middle.next;
	 
	        // set the next of middle node to null
	        middle.next = null;
	 
	        // Apply mergeSort on left list
	        Node<Integer> left = mergeSort(head);
	 
	        // Apply mergeSort on right list
	        Node<Integer> right = mergeSort(nextofmiddle);
	 
	        // Merge the left and right lists
	        Node<Integer> sortedlist = merge(left, right);
	        return sortedlist;
	    }
	
	public static Node<Integer> findMid(Node<Integer> head ) {
		
		if(head==null) {
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
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null  , tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			data = sc.nextInt();
		}
		return head;
		
	}

}
