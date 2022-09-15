package roughWork.learnCoding.fileHandling;
import java.io.*;
public class CopyData {
	
	public static void main(String args[]) throws Exception{
		
		FileInputStream r = new FileInputStream("C:\\Users\\PC\\OneDrive\\Desktop\\satyendra.txt");
		// this class is used for reading the file
		FileOutputStream w = new FileOutputStream("C:\\Users\\PC\\OneDrive\\Desktop\\satyendraNew.txt");
		// this class is used to create the file and perform the write operation
		
		int i;
		while((i=r.read()) != -1) {
			w.write((char)i);
		}
		System.out.println("data copied succesfully ");
	}

}
 