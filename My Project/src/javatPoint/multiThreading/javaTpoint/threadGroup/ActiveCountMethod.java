package javatPoint.multiThreading.javaTpoint.threadGroup;

public class ActiveCountMethod {
	
	public static void main(String argvs[]){    
		ThreadGroup tg = new ThreadGroup("The parent group of threads");  
		  
		ThreadNew th1 = new ThreadNew("first", tg);  
		System.out.println("Starting the first");  
		  
		ThreadNew th2 = new ThreadNew("second", tg);  
		System.out.println("Starting the second");  
		System.out.println("The total number of active threads are: " + tg.activeCount());  
	}  

}
class ThreadNew extends Thread {  
	ThreadNew(String tName, ThreadGroup tgrp){  
		super(tgrp, tName);  
		start();  
	}  
	public void run()  {  
	  
		for (int j = 0; j < 1000; j++){  
			try  {  
				Thread.sleep(5);  
			}catch (InterruptedException e){  
				System.out.println("The exception has been encountered " + e);  
			}  
		}  
	}  
} 