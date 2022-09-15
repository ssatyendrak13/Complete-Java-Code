package apniKaksha.dataStructure.list.vector;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> value = new Vector();
		System.out.println("now  many put in this you want");
		int n = sc.nextInt();
		for(int i =0; i<n; i++) {
			value.add(i);
		}
		System.out.println(value);
		

	}

}
