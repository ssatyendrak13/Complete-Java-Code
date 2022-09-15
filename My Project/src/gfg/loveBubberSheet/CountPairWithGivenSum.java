package gfg.loveBubberSheet;

import java.util.HashMap;

public class CountPairWithGivenSum {

	public static void main(String[] args) {
		int input[] = {1, 1, 1, 1};
		System.out.println(getPairsCount1(input , input.length , 2));

	}
	static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int pair = 0;
        int r =0;
        int c=1;
        for(int i=0; i<n*n; i++){
            
            int temp = arr[r]+arr[c];
            if(temp == k){
                pair++;
            }
            c++;
            if(c==n){
                r++;
                c=r+1;
            }
            if(r==n-1){
                break;
            }
            
        }
        return pair;
    }
	static int getPairsCount1(int[] arr  , int n , int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
        int sumCount = 0;
        for(int i = 0; i<n; i++){
            if(map.containsKey(k-arr[i])) sumCount+=map.get(k-arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return sumCount;
	}

}
