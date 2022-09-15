package apniKaksha.statements.conditionalStatemet;

public class NestedShortHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;int b=45;int c=78;
		int result=0;
		result=a>b?b>c?a:c:b>c?b:c;
		System.out.println("maximum number is= "+result);

	}

}
