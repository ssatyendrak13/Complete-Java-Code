package hackerrank.problemSolving.easy;
import java.util.*;
public class MagratoryBird {
	
	 public static void main(String args[]) {
		 
		 int input[] = {1,2,3,4,5,4,3,2,1,3,4};
		 List<Integer> list = new ArrayList<>();
		 for(int i : input) {
			 list.add(i);
		 }
		 int  result = migratoryBirds1(list);
		 System.out.println(result);
	 }
	 
	 static int migratoryBirds1(List<Integer> arr) {
	        Map<Integer, Integer> birds = new HashMap<>();
	        int key = 0;

	        for(int i = 0; i < arr.size(); i++){
	            if(birds.containsKey(arr.get(i))){
	                birds.put(arr.get(i), birds.get(arr.get(i)) + 1);
	            }else{
	                birds.put(arr.get(i), 1);
	            }
	        }
	        key = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
	        return key;
	    }
	
	 public static int migratoryBirds(List<Integer> arr) {
		    int fr[] = new int[arr.size()];
		    int count = Integer.MIN_VALUE;
		    int visited =-1;
		 for(int i=0; i<arr.size(); i++) {
			 int tempCount =1;
			 for(int j=i+1; j<arr.size(); j++) {
				 if(arr.get(i) == arr.get(j)) {
					 tempCount++;
					 fr[j]=visited;
				 }
			 }
			 if(fr[i] != visited)
				 fr[i]=tempCount;
			 if(count<tempCount) {
				 count = tempCount;
			 }
			 
		 }
		 int temp =Integer.MAX_VALUE;
		 for(int i=0; i<arr.size(); i++) {
			 if(fr[i] == count) {
				 if(temp > arr.get(i)) {
					 temp = arr.get(i);
				 }
			 }
		 }
		 return temp;
		 // this code is not good beacouse this code take more time to execute 

	 }

}
