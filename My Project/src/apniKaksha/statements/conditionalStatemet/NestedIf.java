package apniKaksha.statements.conditionalStatemet;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=18,c=28;
		int result=0;
		if (a>b) {
			if (b>c) {
				result=a;
			}else {
				result=c;
			}
		}else {
			if(b>c) {
				result=b;
			}else {
				result=c;
			}
		}System.out.println("maximum number is="+result);

	} 

}
