package codingNinjas.algorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ActivitySelection {

	public static void main(String[] args) {

		int start[] =  {1, 3, 0, 5, 8, 5};
	    int end[] =  {2, 4, 6, 7, 9, 9};
		System.out.println(maxMeetings(start , end, start.length));
		
	}
	public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<int[]> al = new ArrayList<>();
        for(int i = 0; i < n; i++)
            al.add(new int[]{start[i] , end[i]});
            
        Collections.sort(al , (a, b)->(a[1] - b[1]));
    
        int res = 1 , prev = 0;
        for(int curr = 1; curr < n; curr++)
        {
            if(al.get(curr)[0] > al.get(prev)[1])
            {
                res++;
                prev = curr;
            }
        }
        
        return res;
    }
}
