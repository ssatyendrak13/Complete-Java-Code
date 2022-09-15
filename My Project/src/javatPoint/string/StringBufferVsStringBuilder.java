package javatPoint.string;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuffer sbuffer = new StringBuffer("java");
		for(int i=0;i<=10000; i++) {
			sbuffer.append("tpoint");
		}
		System.out.println("time take by append in String buffer "+(System.currentTimeMillis()-startTime));
		
		startTime = System.currentTimeMillis();
		StringBuilder sbuilder = new StringBuilder("java");
		
		for(int i=0;i<=10000;i++) {
			sbuilder.append("tpoint");
		}
		System.out.println("time taken by append in String Builder"+(System.currentTimeMillis()-startTime));
		

	}

}
