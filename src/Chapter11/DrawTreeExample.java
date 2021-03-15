package Chapter11;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawTreePanel extends JPanel {
	private int count = 0;
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		drawTree(g, 400, 300, 2);
	}
	
	private void drawTree(Graphics g, int x1, int y1, int depth) {
		if (x1 <= 100 || y1 <= 0)
			return;
		
		count++;
		
		int x2 = x1 - 10*depth;
		int y2 = y1;
		
		depth++;
		
		if(count % 2 == 0) 
			g.setColor(Color.BLUE);
		else
			g.setColor(Color.RED);
		
		g.drawLine(x1, y1, x2, y2);
		
		drawTree(g, x2, y2, depth);
	}
}



public class DrawTreeExample extends JFrame {
	
	public DrawTreeExample() {
		setSize(800, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new DrawTreePanel();
		add(panel);
	}
	
	public static void main(String args[]) {
		new DrawTreeExample();
	}
}
