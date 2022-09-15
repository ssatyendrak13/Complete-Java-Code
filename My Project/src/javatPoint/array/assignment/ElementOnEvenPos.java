package javatPoint.array.assignment;

public class ElementOnEvenPos {
	
	public static void main(String args[]) {
		print(new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3});
	}
	
	public static void print(int input[]) {
		for(int i=0;i<input.length;i++) {
			if(i%2 ==0 ) {
				System.out.print(input[i]+" ");
			}
		}
	}

}
