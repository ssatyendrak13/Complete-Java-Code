package ramaSoft.commandLineArgs;

public class Example3 {
	
	public static void main(String []args){
		double sum=0.0;
		for(String val:args)
		{
			sum+=Double.parseDouble(val);
		}

		System.out.println("sum="+sum);




	}

}
