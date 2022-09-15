package javatPoint.collectionFrameWork.list;
import java.util.*;
public class ListToArray {
	
	public static void main(String args[]){  
		   
		 List<String> list=new ArrayList<String>();  
		 
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 
//		 String str[] = list.toArray(new String[(list.size())]);
		 String[] array = list.toArray(new String[list.size()]);
		 System.out.println(Arrays.toString(array));
		  
		}  

}
