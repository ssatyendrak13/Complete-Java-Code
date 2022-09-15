package ramaSoft.commandLineArgs;

public class Example {
	
	 //command prompt---"sushil" "ravi" "mohit"
		public static void main(String []args){
		                        //length=3
//		                        args[]={"sushil","ravi","mohit"};
		   for(int r=0;r<args.length;r++)
		   	System.out.println(args[r]);

		   	for(String val:args)
		   		System.out.println(val);
		}

}
