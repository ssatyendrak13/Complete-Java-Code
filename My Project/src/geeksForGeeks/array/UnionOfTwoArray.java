package geeksForGeeks.array;

import java.util.HashSet;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]={1,2,10};
		System.out.println(doUnion(a , a.length , b , b.length));
	}
	public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
		HashSet<Integer> hs = new HashSet();
       for(int i=0;i<n;i++) {
    	   hs.add(a[i]);
       }
       for(int j=0; j<m;j++) {
    	   hs.add(b[j]);
       }
       return hs.size();
    } 

}
