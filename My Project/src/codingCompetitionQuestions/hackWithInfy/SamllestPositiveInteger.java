package codingCompetitionQuestions.hackWithInfy;
/*  you are given an array of length N . find the smallest positive integer x such that there exist no pairs of integers 
 * i,j where 0 <= i<j<n for which gcd of arr[i] and arr[j] is divisible by x */
import java.util.ArrayList;
import java.util.List;

public class SamllestPositiveInteger {
	
	public static void main(String args[]) {
		
		int arr[] = {60,96};
		List<Integer> list = new ArrayList<>();
		for(int i=0;i <arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(gcdTrouble(list.size() , list));
		
	}
	
	public static int gcdTrouble(int N , List<Integer> arr) {
		
		int ans =0;
		int gcdTemp = 0;
		for(int i=0; i<arr.size(); i++) {
			
			for(int j=i+1; j<arr.size(); j++) {
				
				if(gcdTemp <= gcd(arr.get(i) , arr.get(j))) {
					gcdTemp = gcd(arr.get(i) , arr.get(j));
				}
				
			}
		}
		
		for(int i=1; i<= gcdTemp ; i++) {
			if(gcdTemp % i !=0 ) {
				ans = i;
				break;
			}
		}
		return ans;
		
		
	}
	
	public static int gcd(int a , int b) {
		if( a == 0) {
			return b;
		}
		return gcd(b%a  , a);
	}

}
