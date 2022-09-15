package javatPoint.array.assignment;

public class LeftRightRotate {

	 public static void main(String[] args) {  
	        rotateRight(new int [] {1, 2, 3, 4, 5 });
	        
	 }
	 public static void rotateRight(int input[]) {
		 
		 for(int i=0;i<3; i++) {
			 int last = input[input.length-1];
			 int j;
			 for(j=input.length-1;j>0;j--) {
				 input[j]=input[j-1];
			 }
			 input[0]=last;
		 }
		 for(int item : input) {
			 System.out.print(item+" ");
		 }
		 
	 }
	 public static void rotateLeft(int input[]) {
		 
		 for(int i=0;i<3;i++) {
			 int first = input[0];
			 int j;
			 for(j=0; j<input.length-1; j++) {
				 input[j]=input[j+1];
			 }
			 input[j]=first;
		 }
		 for(int item : input) {
			 System.out.print(item+" ");
		 }
	 }
	 
	
}
