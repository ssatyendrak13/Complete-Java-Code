package javatPoint.multiThreading.javaTpoint.namingThread;

public class CurrentThread {
	
	public static void main(String args[]) {
		
		Thread2 t = new Thread2();
		t.start();
		
	}

}
class Thread2 extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
