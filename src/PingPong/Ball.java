package PingPong;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
	private static final int RADIUS = 20;
	int x = 290;
	int y = 200;
	int xspeed = 2;
	int yspeed = 2;
	private GameBoard game;
	Color color;
	
	
	public int score1 = 0;
	public int score2 = 0;
	
	public Ball(GameBoard game, Color color, int score1, int score2) {
		this.game = game;
		this.color = color;
	}
	
	void move() {
		if (x < 0) {
			score1++;
			init();
		}
		
		if (x == game.getWidth() - 2*RADIUS){
			score2++;
			init();
		}
		
		if (y < 0)
			yspeed = -yspeed;
		if (y > game.getHeight() - 2 * RADIUS)
			yspeed = -2;
		
		
		if (collision()) 
			xspeed = -xspeed;
		
		
		x += xspeed;
		y += yspeed;
	}
	
	
	
	void init() {
		x = game.getWidth()/2;
		y = game.getHeight()/2;

		game.scoreLabel.setText(score2 + " : " + score1);
	}
	
	private boolean collision() {
		return game.racquet1.getBounds().intersects(getBounds())
			|| game.racquet2.getBounds().intersects(getBounds());
	}
	
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillOval(x, y, 2*RADIUS, 2*RADIUS);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 2*RADIUS, 2*RADIUS);
	}
}
