package javatPoint.string.fAQ;

public class Toggle {
	public static void main(String args[]) {
		String str = "this is javatpoint";
//		System.out.println(toggle(str));
		toggleMyMethod(str);
	}
	
	public static String toggle(String str){  
	    String words[]=str.split("\\s");  
	    String toggle="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return toggle.trim();  
	}  
	public static void toggleMyMethod(String str) {
		
		String result = "";
		String arr[] = str.split(" ");
		for(String item : arr) {
			result += item.substring(0,1).toLowerCase()+item.substring(1).toUpperCase()+" ";
		}
		System.out.println(result);
		
	}

}
