package javatPoint.javaSwings.jMenu;
import javax.swing.*;
import java.awt.event.*;
public class MenuExample extends JFrame implements ActionListener{
	
	JTextArea textarea; JMenuItem cut,copy,paste,selectAll;
	
	MenuExample(){
		
		
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		setJMenuBar(menubar);
		
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
		textarea = new JTextArea();
		textarea.setBounds(5,5,360,320); 
		add(textarea);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==cut) {
			textarea.cut();
		}
		if(e.getSource()==copy) {
			textarea.copy();
		}
		if(e.getSource()==paste) {
			textarea.paste();
		}
		if(e.getSource()==selectAll) {
			textarea.selectAll();
		}
		
	}
	
	public static void main(String args[]) {
		new MenuExample();
	}

}
