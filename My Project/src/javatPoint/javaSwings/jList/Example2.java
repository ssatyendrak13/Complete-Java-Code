package javatPoint.javaSwings.jList;

import javax.swing.DefaultListModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example2 extends JFrame {

	Example2(){
		
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("java");
		l1.addElement("c++");
		l1.addElement("python");
		l1.addElement("javascript");
		l1.addElement("php");
		JList<String> list1 = new JList(l1);
		list1.setBounds(200,50,75,75);
		add(list1);
		
		
		DefaultListModel<String> l2 = new DefaultListModel<>();
		l2.addElement(".net");
		l2.addElement("bootstrap");
		l2.addElement("networking");
		l2.addElement("angular");
		l2.addElement("nodejs");
		JList<String> list2 = new JList(l2);
		list2.setBounds(50,50,75,75);
		add(list2);
		
		JLabel l = new JLabel("this is area where we will print");
		l.setBounds(75 , 150 , 600 , 30);
		add(l);
		
		JButton b = new JButton("show");
		b.setBounds(100, 200,70 ,30);
		add(b);
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {   
                String data = "";  
                if (list1.getSelectedIndex() != -1) {                       
                   data = "Programming language Selected: " + list1.getSelectedValue();   
                   l.setText(data);  
                }  
                if(list2.getSelectedIndex() != -1){  
                   data += ", FrameWork Selected: ";  
                   for(Object frame :list2.getSelectedValues()){  
                      data += frame + " ";  
                   }  
                }  
                l.setText(data);  
             }  
			
		});
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String args[]) {
		new Example2();
	}
}
