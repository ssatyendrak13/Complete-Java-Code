package javatPoint.javaSwings.jFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
public class Example extends JFrame implements ActionListener{
	JMenuItem open; JTextArea ta;
	Example(){
		
		JMenu menu = new JMenu("file");
		JMenuBar menubar = new JMenuBar();
		menubar.add(menu);
		setJMenuBar(menubar);
		
		open = new JMenuItem("open");
		menu.add(open);
		open.addActionListener(this);
		
		ta=new JTextArea(800,800);    
		ta.setBounds(0,20,800,800);              
		add(ta);  
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e) {
		 JFileChooser fc=new JFileChooser();    
		    int i=fc.showOpenDialog(this);    
		    if(i==JFileChooser.APPROVE_OPTION){    
		        File f=fc.getSelectedFile();    
		        String filepath=f.getPath();    
		        try{  
		        BufferedReader br=new BufferedReader(new FileReader(filepath));    
		        String s1="",s2="";                         
		        while((s1=br.readLine())!=null){    
		        s2+=s1+"\n";    
		        }    
		        ta.setText(s2);    
		        br.close();    
		        }catch (Exception ex) {ex.printStackTrace();  }                 
		    }    
		}    
	public static void main(String args[]) {
		new Example();
	}

}
