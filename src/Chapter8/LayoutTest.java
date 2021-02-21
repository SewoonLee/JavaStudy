package Chapter8;

import java.awt.GridLayout;
import javax.swing.*;

public class LayoutTest extends JFrame{
	
	
	public LayoutTest() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 3));
		
		for (int i = 0; i < 10; i++) {
			p.add(new JButton("Button" + i));
		}
		
		add(p);
		pack();
		setVisible(true);
	}
	
	public static void main(String args[]) {
		LayoutTest f = new LayoutTest();
	}
	
}
