package javatPoint.oops.inheritance;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Multiple {
	
	 public static void main(String[] args)
	    {
	        child c = new child();
	        c.print_geek();
	        c.print_for();
	        c.print_geek();
	    }

}
interface one1 {
    public void print_geek();
}
 
interface two1 {
    public void print_for();
}
 
interface three1 extends one1, two1 {
    public void print_geek();
}
class child implements three1 {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }
 
    public void print_for() { System.out.println("for"); }
}
