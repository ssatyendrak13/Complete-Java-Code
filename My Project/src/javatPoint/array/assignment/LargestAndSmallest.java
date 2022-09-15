package javatPoint.array.assignment;

public class LargestAndSmallest {
	
	public static void main(String args[]) {
		largestSmallest(new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3});
	}
	
	public static void largestSmallest(int input[]) {
		int min = input[0];
		for(int i=0;i<input.length;i++) {
			if(min > input[i])
				min=input[i];
		}
		int max = input[0];
		for(int i=0;i<input.length;i++) {
			if(max < input[i])
				max = input[i];
		}
		System.out.println("min element is "+min+" and max element is "+max);
	}

}
