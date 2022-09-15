package apniKaksha.statements.looping.forLoop;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if (i>=50 && i<=60) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
