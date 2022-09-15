package javatPoint.javaSwings.jTree;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Example  {

	Example(){
		JFrame f = new JFrame("jtree example");
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
		style.add(font);
		style.add(color);
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
	    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
	    DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
	    DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
	    color.add(red); color.add(blue); color.add(black); color.add(green);      
		JTree t = new JTree(style);
		f.add(t);
		
		f.setSize(400,400);
//		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		new Example();
	}
}
