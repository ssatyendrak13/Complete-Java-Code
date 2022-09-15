package javatPoint.multiThreading.javaTpoint.threadPool;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	static final int MAX_TH = 3;              
	public static void main(String argvs[]){  
		Runnable rb1 = new Tasks("task 1");  
		Runnable rb2 = new Tasks("task 2");  
		Runnable rb3 = new Tasks("task 3");  
		Runnable rb4 = new Tasks("task 4");  
		Runnable rb5 = new Tasks("task 5");   
		  
		ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);   
		pl.execute(rb1);  
		pl.execute(rb2);  
		pl.execute(rb3);  
		pl.execute(rb4);  
		pl.execute(rb5);  
		pl.shutdown();    
	}  
}

class Tasks implements Runnable  
{  
private String taskName;   
public Tasks(String str){     
	taskName = str;  
}  
  
// Printing the task name and then sleeps for 1 sec  
// The complete process is getting repeated five times  
public void run()  
{  
try  
{  
for (int j = 0; j <= 5; j++)  
{  
if (j == 0)  
{  
//Date dt = new Date();  
SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");  
  
//prints the initialization time for every task  
//System.out.println("Initialization time for the task name: "+ taskName + " = " + sdf.format(dt));  
  
}  
else  
{  
//Date dt = new Date();  
SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");  
  
// prints the execution time for every task  
//System.out.println("Time of execution for the task name: " + taskName + " = " +sdf.format(dt));  
  
}  
  
// 1000ms = 1 sec  
Thread.sleep(1000);  
}  
  
System.out.println(taskName + " is complete.");  
}  
  
catch(InterruptedException ie)  
{  
ie.printStackTrace();  
}  
}  
} 
