package javatPoint.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
	
	public static void main(String args[])throws Exception {
		
	Scanner sc = new Scanner(System.in);
		 try {
			 
			 int t = sc.nextInt();
			 while(t>0) {

				 int n = sc.nextInt();
				 int s1[] = new int[n];
				 int s2[] = new int[n];
				 int s3[] = new int[n];
				 for(int i=0; i<n; i++) {
					 s1[i]=sc.nextInt();
				 }
				 for(int i=0; i<n; i++) {
					 s2[i]=sc.nextInt();
				 }
				 for(int i=0; i<n; i++) {
					 s3[i]=sc.nextInt();
				 }
				 int max1=Integer.MIN_VALUE;
				 for(int i=0; i<n; i++) {
					 if(max1<s1[i]) max1 = s1[i];
				 }
				 int max2=Integer.MIN_VALUE;
				 for(int i=0; i<n; i++) {
					 if(max2<s2[i]) max2 = s2[i];
				 }
				 int max3=Integer.MIN_VALUE;
				 for(int i=0; i<n; i++) {
					 if(max3<s3[i]) max3 = s3[i];
				 }
				 boolean isok=false;
				 if(max1<max2) {
					 if(max2< max3 )isok=true;
				 }
				 if(isok) System.out.println("yes");
				 else System.out.println("no");
				 
			 }
			 
			 
		 }catch(Exception e ) {
			 
		 }finally {
			 
		 }
		
		
		
	}

}
