package codingCompetitionQuestions.hackWithInfy;

import java.util.ArrayList;
import java.util.List;

public class MinLenOfSubArrayToFindCost {
	
	public static void main(String args[]) {
		
		int arr[] = {3,8,8,8,1,9,6};
		int arr1[] = {3,8,5,9,7,1,8};
		int arr2[] = {7,9,4,1,8};
		List<Integer> list = new ArrayList<>();
		try {
			for(int i=0; i<arr.length; i++) {
				list.add(arr2[i]);
			}
			System.out.println(Solve(list.size() , 4 , list));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static int Solve(int N , int K , List<Integer> A) {
		
		int  minLen = 0;
		int sum = 0;
		int  min = Integer.MAX_VALUE;
		for(int i=0; i<A.size(); i++) {
			
			if(A.get(i) > K) {
				
				if(sum < K) {
					sum = sum + A.get(i)/K;
					minLen++;
				}else {
					break;
				}
				
			}
			
		}
		if(minLen > 0) {
			return minLen;
		}else {
			return -1;
		}
		
	}

}
