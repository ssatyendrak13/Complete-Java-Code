package apniKaksha.Array;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of all students ");
		int n=sc.nextInt();
		int [] marks = new int [n];
		System.out.println("enter the marks now  ");
		for (int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		int averageMarks=0;
		for(int i=0;i<n;i++) {
			averageMarks=averageMarks+marks[i];
		}
		averageMarks=averageMarks/n;
		System.out.println(averageMarks);

	}

}
