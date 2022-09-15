//package ramaSoft.arrays.twoD;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DiagonalDifference {
//	
//	public static void main(String args[]) {
//		
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		for(int i=0; i<list.size(); i++) {
//			for(int j=0; j<list.size(); j++) {
//				list.addAll(10,20);
//			}
//		}
//		
//	}
//	
//	 public static int diagonalDifference(List<List<Integer>> arr) {
//		 
//		 int sum1 =0;
//		 int sum2 = 0;
//		 for(int i=0; i<arr.size(); i++) {
//			 for(int j=0; j<arr.get(i).size(); j++) {
//				 if(i==j) sum1 += arr.get(i).get(j);
//				 if((i+j)%arr.size()-1==0) sum2 += arr.get(i).get(j);
//			 }
//		 }
//		 return sum1+sum2;
//		        
//	 }
//
//}
