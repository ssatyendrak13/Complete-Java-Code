package javatPoint.collectionFrameWork.ComparableAndComparator.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class CheckComparable1 {
	
	public static void main(String args[]) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		Student s1 = new Student(1 , "sattu" , 20);
		Student s2 = new Student(6 , "sattu" , 21);
		Student s3 = new Student(5 , "sattu" , 22);
		Student s4 = new Student(4 , "sattu" , 23);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
class Student implements Comparable<Student>{
	private int rollNumber;
	private String name;
	private int age;
	Student(int rollNumber  , String name , int age){
		this.rollNumber=rollNumber;
		this.name=name;
		this.age=age;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + "]";
	}



	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int compareTo(Student o) {
		if(this.rollNumber>o.rollNumber) {
			return 1;
		}
		else if(this.rollNumber < o.rollNumber) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
