package Chapter11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BezierCurve extends JFrame implements MouseListener, MouseMotionListener {
	
	private int[] xs = {50, 150, 400, 450};
	private int[] ys = {200, 50, 300, 200};
	
	private int dragIndex = -1;
	
	private BezierPanel drawPanel;
	
	class BezierPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			g.fillRect(xs[0], ys[0], 16, 16);
			g.fillRect(xs[2], ys[2], 16, 16);
			g.setColor(Color.red);
			g.fillRect(xs[1], ys[1], 16, 16);
			g.fillRect(xs[3], ys[3], 16, 16);
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.black);
			GeneralPath path = new GeneralPath();
			path.moveTo(xs[0], ys[0]);
			path.curveTo(xs[1], ys[1], xs[2], ys[2], xs[3], ys[3]);
			g2d.draw(path);
		}
	}
	
	public BezierCurve() {
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("베지어 커브 데모");
		
		drawPanel = new BezierPanel();
		drawPanel.addMouseListener(this);
		drawPanel.addMouseMotionListener(this);
		add(drawPanel, BorderLayout.CENTER);
	}
	
	public void mousePressed(MouseEvent e) {
		dragIndex = -1;
		for (int i = 0; i < 4; i++) {
			Rectangle r = new Rectangle(xs[i] - 4, ys[i] - 4, 20, 20);
			if (r.contains(e.getX(), e.getY())) {
				dragIndex = i;
			}
		}
		repaint();
	}
	
	public void mouseReleased(MouseEvent e) {
		dragIndex = -1;
		repaint();
	}
	
	public void mouseDragged(MouseEvent e) {
		if (dragIndex != -1) {
			xs[dragIndex] = e.getX();
			ys[dragIndex] = e.getY();
		}
		repaint();
	}
	
	public void mouseClicked(MouseEvent e) {	}
	public void mouseEntered(MouseEvent e) {	}
	public void mouseExited(MouseEvent e) {	}
	public void mouseMoved(MouseEvent e) {	}
	
	public static void main(String args[]) {
		new BezierCurve();
	}
}