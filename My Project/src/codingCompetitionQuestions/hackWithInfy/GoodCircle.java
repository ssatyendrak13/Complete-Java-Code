package codingCompetitionQuestions.hackWithInfy;

import java.util.ArrayList;
import java.util.List;

public class GoodCircle {
	
	public static void main(String args[]) {
		
		
		int arr[] = {6,7,9};
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {4,6,8,3,6,9,5,12,15,17};
		List<Integer> list = new  ArrayList<>();
		for(int i=0; i <arr.length; i++) {
			list.add(arr2[i]);
		}
		System.out.println(NGD(list.size(),list));
		
	}
	
	public static int NGD(int N , List<Integer> Arr) {
		int count=0;
		for(int i=0;i <Arr.size() ; i++) {
			
			for(int j=0; j<=Arr.size(); j++) {
				
				if( i*i + j*j == Arr.get(i) ) {
					count++;
				}
				
			}
			
		}
		return count;
	}

}
