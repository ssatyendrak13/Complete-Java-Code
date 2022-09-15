package codingCompetitionQuestions.hackWithInfy;
/* you are given an array of A intgeger N . in one moves you pick two indices i,j such that 
 * Ai is not divisible by Aj and Aj is not divisible by Ai 
 * then remove the element in any one of the chosen indices . you must performed a move as long as it is possible 
 * 
 *  find the minimum number of move to be performed an A if you choose i j optionally */
import java.util.ArrayList;
import java.util.List;

public class MinMovesOnArray {
	
	public static void main(String args[]) {
		
		int arr[] = {9,54,3};
		List<Integer> list = new ArrayList<>();
		for(int i=0;i <arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(Solve(arr.length , list));
		
	}
	
	public static int Solve(int N ,  List<Integer> A) {
		
		int minMoves = 0;
		
		for(int i=0; i<A.size(); i++) {
			int count = 0;
			for(int j=0; j<A.size(); j++) {
				
				if(i != j) {
					
					if(((A.get(i) % A.get(j) == 0) || (A.get(j) % A.get(i) == 0))  && A.get(j) != -1) {
						
						count++;
					}	
				}
			}
			if(count == 0) {
				minMoves++;
				A.set(i, -1);
			}
			
		}
		return minMoves;
		
		
	}

}
