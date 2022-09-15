package apniKaksha.dataStructure.set;

public class SubArraySum {
	
	public static void main(String args[]) {
		
		int a[] = {7,4,2,9,5,-14};
		boolean found = true;
		for(int i=0; i<a.length; i++) {
			int sum =0; 
			for(int j=i ; j<a.length; j++) {
				sum += a[j];
				if(sum==0) {
					found=true;
					break;
				}
				
			}
			if(found) break;
			
		}
		System.out.println(" found "+found);
	}

}
