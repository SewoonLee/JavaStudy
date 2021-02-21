package Chapter8;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;


public class Calculator extends JFrame {
	private JPanel p1;
	private JTextField t1;
	private JButton[] buttons;
	private String[] labels = {
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",
	};
	
	
	public Calculator() {
		t1 = new JTextField(35);
		p1 = new JPanel();
		t1.setText("0.");
		t1.setEnabled(false);
		
		p1.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				p1.add(buttons[index]);
				index++;
				
			}
		}
		add(t1, BorderLayout.NORTH);
		add(p1, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	
	public static void main(String args[]) {
		Calculator c = new Calculator();
	}
}
