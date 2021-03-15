package Chapter10;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyGame extends JFrame implements ActionListener {
	private JPanel panel1;
	private JPanel panel2;
	private JButton button;
	private JLabel label1, label2, label3;
	private int first = 0;
	private int second = 0;
	private int third = 0;
	Random r = new Random();
	
	
	MyGame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		label1 = new JLabel(first + "");
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel1.add(label1);
		
		label2 = new JLabel(second + "");
		label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel1.add(label2);
		
		label3 =new JLabel(third + "");
		label3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel1.add(label3);
		
		button = new JButton("랜덤");
		button.addActionListener(this);
		panel2.add(button);
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		setSize(400, 300);
		setVisible(true);
		setTitle("MyGame");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label1.setText(r.nextInt(9)+1 + "");

			label2.setText(r.nextInt(9)+1 + "");

			label3.setText(r.nextInt(9)+1 + "");
		}
	}
}

public class RandomGame {
	public static void main(String args[]) {
		MyGame g =new MyGame();
	}
}
