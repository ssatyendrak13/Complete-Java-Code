package roughWork.learnCoding.fileHandling;
import java.io.*;
public class FileWriterClass {
	
	public static void main(String args[]){
		
		try {
			FileWriter f = new FileWriter("C:\\Users\\PC\\OneDrive\\Desktop\\sattu.txt");
			// FileWriter class basically create the file and also write the data into file
			// which we want to write 
			
			try {
				f.write("java is the one of the best programming language");
				// it will write this statement in file which i have created
			}finally {
				f.close();
				// it will close the execution even if file is write or not 
				// all this type of operation can be performed in finally block
			}
			System.out.println("succesfully wrote data in the file ");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
