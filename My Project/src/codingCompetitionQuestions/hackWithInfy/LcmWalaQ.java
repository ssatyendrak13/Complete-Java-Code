package codingCompetitionQuestions.hackWithInfy;

import java.util.ArrayList;
import java.util.List;

public class LcmWalaQ {
	
	public static void main(String args[]) {
		
		int arr2[] = {2,1,6,7};
		List<Integer> list = new  ArrayList<>();
		for(int i=0; i <arr2.length; i++) {
			list.add(arr2[i]);
		}
		System.out.println(Solve(arr2.length , 8 , list));
		
	}
	public static int Solve(int N , int K , List<Integer> A) {
		
		int count=1;
		for(int i=0; i<A.size(); i++) {
			int temp =0;
			for(int j=i+1; j<A.size(); j++) {
				
				temp = LCM(temp , A.get(j));
				if(temp >= K) {
					break;
				}
				count++;
			}
			
		}
		return count;
		
	}
	
		static int GCD(int u, int v)
	    {
	        if (u == 0)
	            return v;
	        return GCD(v % u, u);
	    }
	  
	    static int LCM(int u, int v)
	    {
	        return (u / GCD(u, v)) * v;
	    }

}
