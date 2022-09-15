package hackerrank.problemSolving.medium;

import java.util.ArrayList;
import java.util.List;

public class MinLoss {
	
	public static void main(String args[]) {
		
		List<Long> list = new ArrayList<>();
		long [] arr = {5,10,3};
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(minimumLoss(list));
		
	}
	
	 	public static int minimumLoss(List<Long> price) {
		    // Write your code here
		        
		        Long purchase =(long) 0;
		        for(int i=1;i<price.size(); i++){
		            if(price.get(0) > price.get(i)){
		                purchase = price.get(i);
		                break;
		            }else {
		            	purchase = price.get(0);
		            	break;
		            }
		        }
		       long minLoss = purchase-price.get(price.size()-1);
		        return (int) minLoss;

		    }

}
