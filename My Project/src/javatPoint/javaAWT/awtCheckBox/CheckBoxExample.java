package javatPoint.javaAWT.awtCheckBox;
import java.awt.Frame;
import java.awt.Checkbox;
public class CheckBoxExample extends Frame{
	
	
	CheckBoxExample(){
		
		
		setSize(400, 400);
		setVisible(true);
		setLayout(null);
		Checkbox cb1 = new Checkbox("java");
		Checkbox cb2 = new Checkbox("c++");
		cb1.setBounds(100, 100, 80, 30);
		cb2.setBounds(300,100 , 80, 30);
		add(cb1);
		add(cb2);
		
	}
	public static void main(String args[]) {
		new CheckBoxExample();
	}

}
