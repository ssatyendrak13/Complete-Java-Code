package javatPoint.multiThreading.javaTpoint.joinMethod;

public class JoinMillis {
	
	public static void main(String args[]) {
		Thread2 t1 =  new Thread2();
		Thread2 t2 =  new Thread2();
		Thread2 t3 =  new Thread2();
		
		t1.start();
		try {
			t1.join(1500);
		}catch(Exception  e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
class Thread2 extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
}