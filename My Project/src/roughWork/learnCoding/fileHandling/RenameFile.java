package roughWork.learnCoding.fileHandling;
import java.io.*;
public class RenameFile {
	
	public static void main(String args[]) throws Exception {
		
		File f = new File("C:\\Users\\PC\\OneDrive\\Desktop\\sattu.txt");
		File r = new File("C:\\Users\\PC\\OneDrive\\Desktop\\satyendra.txt");
		
		if(f.exists()) {
			System.out.println(f.renameTo(r));
			//it will rename the name of the file
		}else {
			System.out.println("file doesn't exists");
		}
		
	}

}
