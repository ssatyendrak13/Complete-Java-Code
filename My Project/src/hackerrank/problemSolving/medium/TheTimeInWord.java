package hackerrank.problemSolving.medium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheTimeInWord {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

//        String result = Result.timeInWords(h, m);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
	 public static String timeInWords(int h, int m) {
		    // Write your code here
		 
		 String v[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
		"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
		"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight",
		"twenty nine" };
		    
		 String time;
		 
		 if(m<=30){
		    if(m==0)
		    time=v[h]+" o' clock";
		    else if(m==15)
		    time="quarter past "+v[h];
		    else if(m==30)
		    time="half past "+v[h];
		    else if(m==1)
		    time=v[m]+" minute past "+v[h];
		    else
		    time=v[m]+" minutes past "+v[h];
		  }
		  else{
		    if(m==45)
		    time="quarter to "+v[h+1];
		    else if(m==59)
		    time=v[60-m]+" minute to "+v[h+1];
		    else
		    time=v[60-m]+" minutes to "+v[h+1];
		 }
		 return time;
		    
	}


}
