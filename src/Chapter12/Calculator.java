package Chapter12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator extends JFrame implements ActionListener {
	private String[] buttons = {
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "?", ".", "+", "="
	};
	
	private JTextArea resultArea;
	private JPanel panel;
	private JButton[] button;
	
	Calculator() {
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		resultArea = new JTextArea();
		
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(5 ,5));
		
		button = new JButton[25];
		
		int index = 0;
		
		for (int i = 0; i < 5; i++) {
			button[index] = new JButton(buttons[i]);
			for (int j = 0; j < 5; j++) {
				if(j > 2)
					button[index].setForeground(Color.RED);
				else 
					button[index].setForeground(Color.BLUE);
				
				button[index].setBackground(Color.YELLOW);
				button[index].addActionListener(this);
				panel.add(button[i]);
				index++;
			}
		}
		
		add(resultArea, BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
