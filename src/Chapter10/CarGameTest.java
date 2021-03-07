package Chapter10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("./image/car.png"));
			
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP:	img_y -= 10;	break;
				case KeyEvent.VK_DOWN:	img_y += 10;	break;
				case KeyEvent.VK_LEFT:	img_x -= 10;	break;
				case KeyEvent.VK_RIGHT:	img_x += 10;	break;
				}
				
				repaint();
			}
			public void keyReleased(KeyEvent arg0) {	}
			public void keyTyped(KeyEvent arg0) {		}
		});
		this.requestFocus();
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class CarGameTest extends JFrame {
	public CarGameTest() {
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CarGameTest s= new CarGameTest();
	}
}
