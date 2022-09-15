package javatPoint.multiThreading.javaTpoint.sleepingThread;

public class NegativeSleepingTime extends Thread{

	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(-500);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		NegativeSleepingTime obj1 = new NegativeSleepingTime();
		NegativeSleepingTime obj2 = new NegativeSleepingTime();
		
		obj1.start();
		obj2.start();
		
	}
}
