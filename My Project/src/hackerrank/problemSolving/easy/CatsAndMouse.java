package hackerrank.problemSolving.easy;

import java.util.Scanner;

public class CatsAndMouse {
	
	public static void main(String args[]) {
		int a=2;
		int b =5;
		int c =8;
		System.out.println(catAndMouse(a , b , c));
	}
	
	static String catAndMouse(int x, int y, int z) {
        
        try{
            
        
        if(Math.abs(z-x) < Math.abs(z-y)){
            return "Cat A";
        }if(Math.abs(z-x) > Math.abs(z-y)){
            return "Cat B";
        }else{
            return "Mouse C";
        }
            
        }catch(Exception e){
            return  null;
        }

}


}
