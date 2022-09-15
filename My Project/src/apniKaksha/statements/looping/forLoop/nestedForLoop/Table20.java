package apniKaksha.statements.looping.forLoop.nestedForLoop;

public class Table20 {
	
	public static void main(String [] args) {
		for(int j=1;j<=20;j++) {	
			int table=j;
			for (int i=1;i<=10;i++) {
				System.out.print(table*i+" ");
			}
			System.out.println();
		}
	}
}