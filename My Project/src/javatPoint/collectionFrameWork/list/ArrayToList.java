package javatPoint.collectionFrameWork.list;
import java.util.*;
public class ArrayToList {
	
	public static void main(String args[]){  
		  
		String str[] = {"apple","mango","banana","graps"};
		List<String> list = new ArrayList<>();
		for(String fruit:str)
			list.add(fruit);
		System.out.println(list);
		
		}  

}
