package javatPoint.oops.inheritance;

public class Programmer extends Employee {
	
	int bonus = 1000;
	public static void main(String args[]) {
		Programmer p =  new   Programmer();
		System.out.println(p.salary);
		System.out.println(p.bonus);
	}
	

}
class Employee{
	float salary = 40000;
}
