package Chapter11;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SnowManFacePanel extends JPanel {

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.BLACK);
		g.drawArc(50, 80, 50, 50, 180, -180);
		g.drawArc(140, 80, 50, 50, 180, -180);
		g.drawArc(70, 130, 100, 70, 180, 180);
		
	}
}

public class SnowManFace extends JFrame {
	public SnowManFace() {
		setSize(280, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("SnowMan Face");
		setVisible(true);
		add(new SnowManFacePanel());
	}
	
	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}
}
