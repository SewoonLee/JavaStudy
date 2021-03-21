package PingPong;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet {
	private static final int WIDTH = 10;
	private static final int HEIGHT = 80;
	int x = 0;
	int y = 0;
	Color color;
	int xspeed = 0;
	int yspeed = 0;
	private GameBoard game;
	
	public Racquet(GameBoard game, int x, int y, Color color) {
		this.game = game;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void move() {
		if (y + yspeed > 0 && y + yspeed < game.getHeight() - HEIGHT)
			y += yspeed;

	}
	
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	public void keyReleased(KeyEvent e) {
		yspeed = 0;
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
			yspeed = -3;
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
			yspeed = 3;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, WIDTH, HEIGHT);
	}
}
