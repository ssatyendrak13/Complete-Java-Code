package codingNinjas.algorithms.greedy;
import java.util.*;
public class KnapsackProblems {
	
	public static void main(String args[]) {
		
		int val[] = {60,100,120};
		int weight[]= {10,20,30};
		System.out.println(knapsack(val , weight , val.length  , 50));
		
	}

	public static int knapsack(int values[] , int weight[] , int n , int w) {
		
		ArrayList<int[]> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int ratio = values[i]/weight[i];
			list.add(new int[] {values[i] , weight[i] , ratio});
		}
		for(int item[] : list) {
			for(int val : item) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		Collections.sort(list , (a , b)->(b[1]-a[1])); 
		int sum = 0;
		int tempW = 0;
		int temp =0;
		for(int i=0; i<n; i++) {
			tempW += list.get(i)[1];
			if(tempW<w) {
				sum += list.get(i)[0];
				temp = tempW;
			}else if(tempW==w) {
				break;
			}else {
				sum += (w-temp)*list.get(i)[2];
			}
		}
		
		return sum;
	}

}
