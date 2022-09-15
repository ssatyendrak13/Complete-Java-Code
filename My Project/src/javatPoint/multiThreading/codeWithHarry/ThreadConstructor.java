package javatPoint.multiThreading.codeWithHarry;

public class ThreadConstructor {
	
	public static void main(String args[]) {
		
		MyThr t1 = new MyThr("sattu");
		MyThr t2 = new MyThr("satyendra");
		t1.start();
		t2.start();
		System.out.println("the id of the thread is :"+t1.getId());
		System.out.println("name of the thread is :"+t1.getName());
		System.out.println("the id of the thread is :"+t2.getId());
		System.out.println("name of the thread is :"+t2.getName());
	}

}
class MyThr extends Thread{
	
	public MyThr(String name) {
		super(name);
	}
	public void run() {
//		while(true) {
//			System.out.println(" i am a thread");
//		}
	}
	
}
