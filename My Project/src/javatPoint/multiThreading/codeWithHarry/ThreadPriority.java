package javatPoint.multiThreading.codeWithHarry;

public class ThreadPriority {
	
	public static void main(String args[]) {
		
		MyThr1 t1 = new MyThr1("sattu1");
		MyThr1 t2 = new MyThr1("sattu2");
		MyThr1 t3 = new MyThr1("sattu3");
		MyThr1 t4 = new MyThr1("sattu4");
		MyThr1 t5 = new MyThr1("sattu5(most important)");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
class MyThr1 extends Thread{
	
	public MyThr1(String name) {
		super(name);
	}
	public void run() {
		System.out.println(this.getName());
//		while(true) {
//			System.out.println(" name is : "+this.getName());
//		}
	}
	
}
