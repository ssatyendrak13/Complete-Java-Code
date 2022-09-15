package javatPoint.collectionFrameWork.ComparableAndComparator.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CheckComparator {

	public static void main(String[] args) {
		
		ArrayList<emp> al =  new ArrayList<>();
		
		emp e1 =  new emp(101 , "sattu" , 20);
		emp e2 =  new emp(102 , "nirala" , 21);
		emp e3 =  new emp(103 , "sachin" , 22);
		emp e4 =  new emp(104 , "amar" , 23);
		al.add(e2);
		al.add(e1);
		al.add(e3);
		al.add(e4);
		System.out.println(al);
		Collections.sort(al , new nameComparator());
		System.out.println(al);

	}

}
class emp {
	int id;
	String name;
	int age ;
	emp(int id , String name , int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
class idComparator implements Comparator<emp>{

	@Override
	public int compare(emp o1, emp o2) {
		return o1.getId()-o2.getId();
	}
	
}
class nameComparator implements Comparator<emp>{

	@Override
	public int compare(emp o1, emp o2) {
		return o1.name.compareTo(o2.name);
	}
	
	
	
	
	
	
	
	
}
