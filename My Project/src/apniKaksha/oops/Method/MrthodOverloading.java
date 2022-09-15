package apniKaksha.oops.Method;

public class MrthodOverloading {
		public static void main(String[] args) {
			int x=40;
			int y=45;
			int result=maxOf(x,y);
			System.out.println(result);
			
			sattu(x );
		}
		static int  maxOf(int a,int b) {
			if (a>b) {
				return a;
			}else {
				return b;
			}
		}
		static void sattu(float x) {
			System.out.println(x);
		}

	}



