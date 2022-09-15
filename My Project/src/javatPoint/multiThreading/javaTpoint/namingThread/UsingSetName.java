package javatPoint.multiThreading.javaTpoint.namingThread;

public class UsingSetName {

	
	public static void main(String args[]) {
		
		Thread1 t1 =  new Thread1();
//		Thread1 t2 =  new Thread1();
		System.out.println("Thrad1 name : "+t1.getName());
//		System.out.println("Thread2 name : "+t2.getName());
		
		t1.start();
//		t2.start();
		
		t1.setName("satyendra");
		System.out.println("after changing name of first thread : "+t1.getName());
		
	}
}
class Thread1 extends Thread{
	public void run() {
		System.out.println("running....");
	}
}
