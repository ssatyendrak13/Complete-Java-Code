package javatPoint.string.String;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		
		String s = "hello , my name is sattu";
		String[] name = s.split("\\.");
		System.out.println(Arrays.toString(name));

	}

}
