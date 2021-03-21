package PingPong;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener{
	Ball ball;
	Racquet racquet1;
	Racquet racquet2;
	JLabel	scoreLabel;
	
	int score1 = 0;
	int score2 = 0;
	
	public GameBoard() {
		ball = new Ball(this, Color.white, score1, score2);
		this.setBackground(Color.black);
		
		racquet1 = new Racquet(this, 10, 150, Color.white);
		racquet2 = new Racquet(this, 560, 150, Color.white);
		
		scoreLabel = new JLabel();
		scoreLabel.setText(ball.score2 + " : " + ball.score1);
		scoreLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		scoreLabel.setForeground(Color.white);
		this.add(scoreLabel, BorderLayout.NORTH);
		
		setSize(580,375);
		setFocusable(true);
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S)
			racquet1.keyReleased(e);
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN)
			racquet2.keyReleased(e);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S)
			racquet1.keyPressed(e);
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN)
			racquet2.keyPressed(e);
	}
	
	private void move() {
		ball.move();
		racquet1.move();
		racquet2.move();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		ball.draw(g2d);
		racquet1.draw(g2d);
		racquet2.draw(g2d);
	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("PingPong");
		frame.setSize(580,400);
//		frame.setResizable(false);
		frame.setVisible(true);
//		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GameBoard game = new GameBoard();
		frame.add(game);
		
		while(true) {
			game.move();
			game.repaint();
			try{
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
