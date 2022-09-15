package geeksForGeeks.basic.school;

public class Pattern {
	
	public static void main(String args[]) {
		printPat(3);
	}
	
	static void printPat(int n)
    {
         // Your code here
		for(int t =0 ; t<n ; t++){
            for(int k =n ; k>0 ;k--){
                for(int i =n ; i>t ; i--){
                    System.out.print(k+" ");
                }
            }
            System.out.print("$");

        }
    }

}
