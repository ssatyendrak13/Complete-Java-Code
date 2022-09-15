package hackerrank.problemSolving.easy;
import java.util.*;
public class BirthdayCakeCandles {
	
	public static void main(String args[]) {
		
		int input[] = {1,1,2,2,4,4,5,5,5};
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<input.length; i++) {
			list.add(input[i]);
		}
		int result = birthdayCakeCandles(list);
		
		System.out.println(result);
		
	}
	
	 public static int birthdayCakeCandles(List<Integer> candles) {
		    // Write your code here
		        
		        int max = Integer.MIN_VALUE;
		        for(int i=0; i<candles.size() ; i++){
		            if(max < candles.get(i)){
		                max = candles.get(i);
		            }
		        }
		        int count =0;
		        for(int item : candles){
		            if(item == max){
		                count++;
		            }
		        }
		        return count;
		    }

}
