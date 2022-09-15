package codingNinjas.algorithms.greedy;

import java.util.Arrays;

public class IndianCoinChange {
/*your are given an array of denomination and a value x . you need to find the minimum number 
 * of coins required to make value  */
	public static void main(String[] args) {
		
		System.out.println(coinChange(288 ));

	}
	public static int coinChange(int x ) {
		
		int input[] = {2000,500,200,100,50,20,10,5,2,1};
//		Arrays.sort(input);
		int ans =0;
		int i=0;
		while(x != 0 && i<input.length) {
			
			if(x>=input[i]) {
				x = x-input[i];
				ans++;
			}else {
				i++;
			}
			
		}
		return ans;
	}

}
