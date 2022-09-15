package javatPoint.array;

public class ArrayCloning {

	public static void main(String[] args) {
		
		D2();

	}
	public static void D2() {
		int input[][] = {{1,2},{3,4}};
		for(int item[] : input) {
			for(int val : item) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		int input1[][] = input.clone();
		System.out.println();
		for(int item[] : input1) {
			for(int val : item) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(input==input1);
	}
	public static void D1() {
		int input[] = {33,3,4,5};
		for(int item : input) {
			System.out.print(item+" ");
		}
		System.out.println();
		int carr[] = input.clone();
		for(int item : carr) {
			System.out.print(item+" ");
		}
		System.out.println();
		System.out.println(input==carr);
	}

}
