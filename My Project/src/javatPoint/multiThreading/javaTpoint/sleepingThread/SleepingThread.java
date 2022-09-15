package javatPoint.multiThreading.javaTpoint.sleepingThread;

public class SleepingThread extends Thread{

	
	public static void main(String args[]) {
		
		SleepingThread t1 = new SleepingThread();
		SleepingThread t2 = new SleepingThread();
		
		t1.start();
		t2.start();
		
	}
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
}
