package apniKaksha.Array;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {2,8,6,4,3,7};
		int n=a.length;
		
		for(int i=0; i<n-1; i++) {
			int  minInd = i;
			for(int j = 0; j<n-1; j++) {
				if(a[j+1] < a[minInd]) {
					minInd = i;
				}
			}
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
		}
		for(int item : a) {
			System.out.print (item+" ");
		}

	}

}
