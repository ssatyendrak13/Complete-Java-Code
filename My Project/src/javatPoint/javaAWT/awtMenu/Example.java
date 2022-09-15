package javatPoint.javaAWT.awtMenu;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Example extends Frame{
	
	Example(){
		
		setSize(400 , 400);
		setVisible(true);
		setLayout(null);
		
		
		Menu m = new Menu("Menu");
		MenuItem mi1 = new MenuItem("item1");
		MenuItem mi2 = new MenuItem("item2");
		MenuItem mi3 = new MenuItem("item3");
		MenuItem mi4 = new MenuItem("item4");
		MenuItem mi5 = new MenuItem("item5");
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);
		m.add(mi4);
		m.add(mi5);
		MenuBar mb = new MenuBar();
		mb.add(m);
		setMenuBar(mb);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
	}
	public static void main(String args[]) {
		
		new Example();
	}

}
