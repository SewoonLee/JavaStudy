package Chapter11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorPanel extends JPanel implements ActionListener {
	JButton button;
	Color color = new Color(0, 0, 0);
	
	ColorPanel() {
		button = new JButton("색상 변환");
		button.addActionListener(this);
		add(button);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(color);
	}
	
	public void actionPerformed(ActionEvent e) {
		color = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
		repaint();
	}
}

public class ColorTest extends JFrame {
	public ColorTest() {
		setSize(240, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Color Test");
		setVisible(true);
		JPanel panel = new ColorPanel();
		add(panel);
	}
	
	public static void main(String[] args) {
		ColorTest s = new ColorTest();
	}
}
