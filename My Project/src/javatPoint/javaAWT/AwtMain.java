package javatPoint.javaAWT;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtMain implements WindowListener, ActionListener{
	Label label;
	public AwtMain(){
		
		Frame frame = new Frame("this is first gui");
		
		//----------------------------------------------------------------------
		TextArea textArea = new TextArea("");
		textArea.setBounds(250,40,200,200);
		
		//-----------------------------------------------------------------------
		TextField textField = new TextField();
		textField.setBounds(20, 120, 150, 30);
		textField.setBackground(Color.blue);
		textField.setForeground(Color.white);
		//-------------------------------------------------------------------
		label = new Label("hello friends");
		label.setBounds(20, 90, 150, 30);
		label.setBackground(Color.cyan);
//		label.setForeground(Color.white);
		//-------------------------------------------------------------------
		// if we want to add button to the frame we have to use the button class like this
		Button button = new Button("click me");// "click me " is name  of the button
		button.setBackground(Color.red);    // it will set the background color
		button.setForeground(Color.white); // it will set the color of text as white
        // for position of button we have to use the function
		//setBounds(int x ,int y, int width, int height)
		button.setBounds(20, 40, 80, 30);
		//------------------------------------------------------------------------
		Checkbox checkbox1 = new Checkbox("java");
		checkbox1.setBounds(20, 160, 50, 20);
		Checkbox checkbox2 = new Checkbox("python");
		checkbox2.setBounds(20, 180, 50, 20);
		frame.add(checkbox1);
		frame.add(checkbox2);
		//------------------------------------------------------------------------
	/*now we have to add some action to button which will do some action by clicking on it
	    ** first method */	
//		button.addActionListener(new ActionListener() {
//			//     these ----same as ----these
//			public void actionPerformed(ActionEvent e) {
//				// actionPerformed()  method is used to performed the action by button
//				label.setText("button click successfully ");
//			}
//		});
	// second method 
		button.addActionListener(this);
		// for ding this we have to implements the ActionListener
		//-------------------------------------------------------
		frame.add(textArea);
		frame.add(textField);
		frame.add(label);
		//----------------------------------------------------------------------------
		// now button is created .. so we have to add this button to the frame like this
		frame.add(button);//button is added to the frame  
		// **   button is not going to work becouse setLayout() is working by defalut so 
		//     we have to do setLayout(null) 
		//-------------------------------------------------------------------
		/*
		setSize(400,300); //firstly we have to declare the size of the frame
		setVisible(true); // we want to see the frame so we have to write this line
			*	for execution of above code we have to extends the Frame class which is
				availabe in awt package
		*/
		//   or 
		//Frame frame = new Frame("first GUI");
		frame.setSize(700,500); // width=400 and height = 300
		frame.setLayout(null); // now button can achieve specific position
		frame.setVisible(true);
		// both of the code are working same 
		
	//--------------------------------------------------------------------------	
		//* in this frame cut(cancle or close ) button are not working 
		//  ** method to close the window
//		frame.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				frame.dispose();
//			}
//		});
		//now our frame can close by close button
		/* method - 2 to close the window by creating the seprate method addWindowListener()
		 * basically with the help of addWindowListener() method we can add multiple 
		 * functionlities in popup window*/
		
		frame.addWindowListener(this);/*this is not neccessary but for the choice of 
		of interest we can do it ...we are not going to prefered becouse this method 
		to handy and we are having to implement lot of unimplemented method*/
		// for ding this we have to implements the WindowListener
	//--------------------------------------------------------------------------
	}
	
	public static void main(String args[]) {
		
		new AwtMain();
		
	}
	/*---------------------------------------------------------------------------- 
	 * below code for the actionListener()----> button action */
	public void actionPerformed(ActionEvent e) {
		label.setText("button click successfully");
	}
	//----------------------------------------------------------------------------
	//below code for the popup window(windowListener method )
	public void windowClosing(WindowEvent e) {
		Frame frame = (Frame)e.getSource();
		frame.dispose();
		System.out.println("WindowClosing");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window opened");
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window closed");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
		
	}
	//-----------------------------------------------------------------------------------

}
