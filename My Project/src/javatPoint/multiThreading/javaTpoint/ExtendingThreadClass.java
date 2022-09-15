package javatPoint.multiThreading.javaTpoint;

public class ExtendingThreadClass extends Thread{
	
	
	public void run() {
		System.out.println("thread by extending the thread class");
	}
	public static void main(String args[]) {
		ExtendingThreadClass obj = new ExtendingThreadClass();
		obj.start();
	}

}
