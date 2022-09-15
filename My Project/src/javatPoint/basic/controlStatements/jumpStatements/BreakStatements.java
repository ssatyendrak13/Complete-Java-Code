package javatPoint.basic.controlStatements.jumpStatements;

public class BreakStatements {
	
	public static void main(String args[]) {
		aa:
		for(int i=1; i<=5;i++) {
			bb:
			for(int j=1; j <=10; j++) {
				System.out.print(j+" ");
				break aa;
			}
			
		}
	}

}
