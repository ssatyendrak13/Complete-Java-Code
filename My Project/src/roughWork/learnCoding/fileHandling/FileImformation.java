package roughWork.learnCoding.fileHandling;
import java.io.*;
public class FileImformation {
	
	public static void main(String args[]) throws Exception {
		File f = new File("C:\\Users\\PC\\OneDrive\\Desktop\\sattu.txt");
		if(f.exists()) {
			System.out.println("file name : "+f.getName());
			// it return the name of the file
			System.out.println("file location : "+f.getAbsolutePath());
			// it return the absolute path of the file 
			System.out.println("file writable : "+f.canWrite());
			// it will say that we can write in the file or not
			System.out.println("file readable : "+f.canRead());
			// it will say that we can read the file or not
			System.out.println("file size : "+f.length());
			// it will return the size of the file
			System.out.println("file removes : "+f.delete());
			// it will delete the file from that location  
		}else {
			System.out.println("file does not exists..");
		}
	}

}
