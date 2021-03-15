package Chapter10;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter extends JFrame implements ActionListener {
	private JLabel label, label1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private int count = 0;
	
	public MyCounter() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		label = new JLabel("Counter");
		panel1.add(label);
		
		label1 = new JLabel(" " + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		
		button1 = new JButton("카운터 증가");
		panel2.add(button1);
		button1.addActionListener(this);
		
		button2 = new JButton("카운터 감소");
		panel2.add(button2);
		button2.addActionListener(this);
		
		button3 = new JButton("카운터 초기화");
		panel2.add(button3);
		button3.addActionListener(this);
		
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		setSize(300, 200);
		setTitle("My Counter");
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == button1) {
			count++;
			label1.setText(count + " ");
		} else if (event.getSource() == button2) {
			count--;
			label1.setText(count + " ");
		} else {
			count = 0;
			label1.setText(count + " ");
		}
	}
}

public class CounterTest {
	public static void main(String args[]) {
		new MyCounter();
	}
}
