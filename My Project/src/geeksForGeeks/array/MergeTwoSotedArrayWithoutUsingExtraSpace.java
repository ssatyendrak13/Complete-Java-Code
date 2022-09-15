package geeksForGeeks.array;

public class MergeTwoSotedArrayWithoutUsingExtraSpace {
	
	public static void  main(String args[]) {
		
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};
		sort(arr1);
	}
	
	public static void merge(int arr1[], int arr2[], int n, int m) {
	    // code here
//		vector<int> s;
//	    for(int i=0;i<n;i++)
//	    {
//	        s.push_back(arr1[i]);
//	    }
//	    for(int i=0;i<m;i++)
//	    {
//	        s.push_back(arr2[i]);
//	    }
//	    sort(s.begin(),s.end());
//	    for(int i=0;i<n;i++)
//	    {
//	        arr1[i]=s[i];
//	    }
//	    for(int i=0;i<m;i++)
//	    {
//	        arr2[i]=s[i+n];
//	    }
	}
	 public static void sort(int arr[]) {
		 arr= new int[10];
		 for(int item : arr) {
			 System.out.print(item+" ");
		 }
	 }

}
