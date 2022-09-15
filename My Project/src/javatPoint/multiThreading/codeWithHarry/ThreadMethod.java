package javatPoint.multiThreading.codeWithHarry;

public class ThreadMethod {
	
	public static void main(String args[]) {
		
		MyThr2 t1 = new  MyThr2();
		MyThr3 t2 = new  MyThr3();
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		
	}

}
class MyThr2 extends Thread{
	public void run() {
		int i=0; 
		while(i<=4000) {
			System.out.println("thank you ");
			i++;
		}
	}
}
class MyThr3 extends Thread{
	public void run() {
		int i=0;
		while(i<=4000) {
			System.out.println("thank you again");
			i++;
		}
	}
}
