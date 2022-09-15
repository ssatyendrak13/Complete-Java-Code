package javatPoint.multiThreading.javaTpoint;

public class ImplementingRunnableInterface {
	
	public static void main(String args[]) {
		Thread1 obj = new Thread1();
		Thread t = new Thread(obj);
		t.start();
		
		Thread t1 = new Thread("this is main thread");
		String s = t1.getName();
		System.out.println(s);	
		
		Runnable r =  new Thread2();
		Thread t2 = new Thread(r , "satyendra");
		t2.start();
		String name = t2.getName();
		System.out.println(name);
	}
}
class Thread1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is first thread  ");	
	}
}
class Thread2 implements Runnable{
	public void run() {
		System.out.println("this is second Thread");
	}
}
