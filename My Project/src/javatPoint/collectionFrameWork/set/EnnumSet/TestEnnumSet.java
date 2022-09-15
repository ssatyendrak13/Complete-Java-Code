package javatPoint.collectionFrameWork.set.EnnumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class TestEnnumSet {
	enum days {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		}  
	public static void main(String[] args) {  
	    Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);    
	    Iterator<days> iter = set.iterator();  
	    while (iter.hasNext())  
	      System.out.println(iter.next());  
	  }  

}
