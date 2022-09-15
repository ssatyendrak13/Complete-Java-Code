package apniKaksha.dataStructure.comparableAndComparators.comparators;

import java.util.*;
public class MainClass {

	public static void main(String args []) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23 , " Ram"));
		students.add(new Student(35 , " Shyam"));
		students.add(new Student(83 , " Aman"));
		students.add(new Student(13 , " Rohit"));
		students.add(new Student(13 , " Anuj"));
		Collections.sort(students , new SortByNameThenMarks());
		students.forEach(System.out::println);
	}
	
}
class SortByNameThenMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks - o2.marks;
		}else {
			return o1.name.compareTo(o2.name);
		}
	}
	
}
//if the name of some pople was same then sort on the basis of marks

