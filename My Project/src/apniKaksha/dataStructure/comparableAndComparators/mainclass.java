package apniKaksha.dataStructure.comparableAndComparators;

import java.util.*;

public class mainclass {
	
	public static void main(String args []) {
	
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23 , " Ram"));
		students.add(new Student(35 , " Shyam"));
		students.add(new Student(83 , " Aman"));
		students.add(new Student(13 , " Rohit"));
		students.add(new Student(13 , " Anuj"));
		Collections.sort(students);
		students.forEach(System.out::println);
	}
}

