package apniKaksha.dataStructure.comparableAndComparators;

public class Student implements Comparable<Student> {
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Student o) {
//		if(this.marks > o.marks) return -1;
//		else if(this.marks < o.marks) return 1;
//		return 0;
		//whem we want do sorting on the basis of name then we can use 
//		return this.name.compareTo(o.name);
		//instead of all code we can also use these code for increasing order output 
		return this.marks - o.marks;
	}
}
