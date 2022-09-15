package javatPoint.javaSwings.jTable;

import javax.swing.*;

public class Example1 {
	
	Example1(){
		
		JFrame f = new JFrame("example of table in java");
		
		String col[]= {"ID" , "NAME" , "SALARY"};
		String data[][] = {
				{"1" , "satyendra" , "30000"},
				{"2" , "sachin" , "40000"},
				{"3" , "nirala" , "50000"}
		};
		
		JTable t = new JTable(data , col);
		t.setBounds(50 , 50 , 200 , 200);
		f.add(t);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Example1();
	}
}
