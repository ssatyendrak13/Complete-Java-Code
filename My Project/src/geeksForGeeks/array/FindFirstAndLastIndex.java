package geeksForGeeks.array;

import java.util.ArrayList;

public class FindFirstAndLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        for(int i=0; i<n ;i++){
            
            if(arr[i]==x){
                list.add((long) i);
                break;
            }
            
        }
        for(int i=arr.length-1; i>0; i--){
            
            if(arr[i]==x){
                list.add((long) i);
                break;
            }
            
        }
        return list;
        
        
    }

}
