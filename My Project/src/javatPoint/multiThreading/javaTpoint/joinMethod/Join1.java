package javatPoint.multiThreading.javaTpoint.joinMethod;
class ThreadJoin extends Thread{
	
	public void run() {
		for(int i=1; i<=2; i++) {
			try {
				Thread.sleep(300);
				System.out.println(" current thread name is : "+Thread.currentThread().getName());
			}catch(Exception e) {
				System.out.println("the exception has begin cautch : "+e);
			}
			System.out.println(i);
		}
	}
	
}
public class Join1 {
	
	public static void main(String args[]) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		
		t1.start();
		try {
			System.out.println("the current thread name is  : "+Thread.currentThread().getName());
			t1.join();
		}catch(Exception e) {
			System.out.println("the exception has begin cauth : "+e);
		}
		t2.start();
		try {
			System.out.println("the current thread name is : "+Thread.currentThread().getName());
			t2.join();
		}catch(Exception e) {
			System.out.println("the exception has begin catch");
		}
		t3.start();
	}

}
