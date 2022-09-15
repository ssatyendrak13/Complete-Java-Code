package geeksForGeeks.array;

public class MinMax {
	
	public static void main(String args[]) {
		
		long A[] = {3, 2, 1, 56, 10000, 167};
		pair result = getMinMax(A , A.length);
		System.out.println(result.first+" and "+result.second);
	}
	
	static pair getMinMax(long a[], long n)  
    {
		
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int i=0;i<a.length; i++) {
        	
        	if(min>a[i]) {
        		min = a[i];
        	}
        	
        }
        for(int i=0;i<a.length;i++) {
        	if(max < a[i])
        		max = a[i];
        }
        pair  name = new pair(min , max);
        return name;
        
        
    }

}
class pair{
	
	
	long first  , second;
	public pair(long first , long second) {
		this.first=first;
		this.second=second;
	}
}
