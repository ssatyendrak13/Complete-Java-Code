package hackerrank.problemSolving.easy;
import java.util.*;
public class PickingNumber {
	
	public static void main(String args[]) {
		
		
		int input[] = {1,1,2,2,4,4,5,5,5};
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<input.length; i++) {
			list.add(input[i]);
		}
		int result = pickingNumbers1(list);
		
		System.out.println(result);
	}
	
	public static int pickingNumbers1(List<Integer> a) {
		
		
//		Scanner readIn = new Scanner(System.in);
		
		int n = a.size();
		int[] frequencie = new int[100];
		for(int ii = 0; ii < n; ii++)
			frequencie[a.get(ii)]++;
		
		int out = Integer.MIN_VALUE;
		for(int ii = 0; ii < frequencie.length - 1; ii++)
			out = frequencie[ii] + frequencie[ii + 1] > out ? frequencie[ii] + frequencie[ii + 1] : out;
		
		return out;
		
	}
	
	public static int pickingNumbers(List<Integer> a) {
	    List<Integer> list = new ArrayList<>();
	    int length =Integer.MIN_VALUE;
		for(int i=0; i<a.size(); i++) {
			
			for(int j=0; j<a.size(); j++) {
				
				if(Math.abs(a.get(i) - a.get(j)) <= 1 && Math.abs(a.get(i) - list.get(j)) <= 1 ) {
					list.add(a.get(i));
					break;
				}else {
					
					if(length < list.size()) {
						length = list.size();
					}
					list.removeAll(list);
					list.add(a.get(i));
					
				}
				
			}
			
		}
		return length;

	}

}
