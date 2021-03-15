package Chapter10;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton button;
	private JLabel[] labels = new JLabel[3];
	private int[] numbers = new int[3];
	

	private JPanel score;
	private JLabel north;
	private JLabel south;
	private int scores;
	
	
	public SlotMachine() {
		setSize(500, 300);
		setLayout(new GridLayout(2, 0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		
		for (int i = 0; i < 3; i++) {
			labels[i] = new JLabel(numbers[i] + "");
			labels[i].setFont(new Font("Serif", Font.BOLD | Font.ITALIC,100));
			
			panel.add(labels[i], BorderLayout.NORTH);
		}
		
		button = new JButton("스핀");
		panel.add(button, BorderLayout.SOUTH);
		button.addActionListener(this);
		
		score = new JPanel();
		score.setLayout(new BorderLayout());
		
		north = new JLabel(" 점수판 ");
		
		south = new JLabel(scores + "");
		
		score.add(north, BorderLayout.NORTH);
		score.add(south, BorderLayout.SOUTH);
		
		
		add(panel);
		add(score);
		
		
		
		setTitle("MyGame");
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			for (int i =0; i<3; i++) {
				numbers[i] = (int) (Math.random() * 10);
				labels[i].setText(" " + numbers[i]);
			}
		}
	}
	
	public static void main(String args[]) {
		new SlotMachine();
	}
}


