package javatPoint.collectionFrameWork.ComparableAndComparator.comparableInterface;
import java.util.*;
public class CheckComparable {
	
	public static void main(String args[]) {
		
		ArrayList<Emp> list = new ArrayList<>();
		Emp e1 = new Emp(100 , "sattu" , "bhopal");
		Emp e2 = new Emp(500 , "nirala" , "patna");
		Emp e3 = new Emp(300 , "sachin" , "delhi");
		Emp e4 = new Emp(400 , "amar" , "mumbai");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
class Emp implements Comparable<Emp>{
	
	private int id ; 
	private String name;
	private String city;
	
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	Emp(int id , String name , String city){
		this.id=id;
		this.name=name;
		this.city=city;
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

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
	

//	public void setCity(String city) {
//		this.city = city;
//	}
	
	
}
