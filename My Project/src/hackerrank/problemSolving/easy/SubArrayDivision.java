package hackerrank.problemSolving.easy;

import java.util.*;

public class SubArrayDivision {
	
	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<>();
		int input[] = {1,2,1,3,2};
		int d = 3;
		int m = 2;
		for(int i=0; i<input.length;i++) {
			
			list.add(input[i]);
			
		}
		System.out.println(solve(list , d , m));
	}
	
	public static int solve(List<Integer> list ,  int d , int m) {
		int sum = 0,ways=0;
        for (int i=0;i<m;i++){
                sum += list.get(i);
        }
        for (int i=0;i<list.size()-m+1;i++) {
                if (sum==d) {
                        ways++;
                }
                if (i+m <list.size()){
                        sum =sum-list.get(i)+list.get(i+m);
                }
        }
        return ways;
		
	}
	

}
