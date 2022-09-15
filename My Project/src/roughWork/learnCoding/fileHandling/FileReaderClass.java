package roughWork.learnCoding.fileHandling;
import java.io.*;
public class FileReaderClass {
	
	
	public static void main(String args[]) {
		
		try {
			FileReader r = new FileReader("C:\\Users\\PC\\OneDrive\\Desktop\\sattu.txt");
			try {
				int i;
				while((i=r.read())!= -1) {
					System.out.print((char)i);
					// we have to do typeCast if we will not do this 
					// it will return the file reference(ASCII) value 
				}
			}finally {
				r.close();
				System.out.println();
				System.out.println("file closed");
			}
		}catch(Exception e) {
			System.out.println("exception handled ");
		}
	}

}
