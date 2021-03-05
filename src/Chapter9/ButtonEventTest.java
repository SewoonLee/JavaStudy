package Chapter9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class MyFrame2 extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;
	
	public MyFrame2() {
		txt = new JTextField(20);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 100));
			panel.add(btn);
		}
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() +actionCommand);
	}
	
}

public class ButtonEventTest {
	public static void main(String args[]) {
		MyFrame2 t = new MyFrame2();
	}
}




