package Chapter11;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoadImageApp extends JPanel {
	BufferedImage img;
	
	public void paint(Graphics g) { 
		g.drawImage(img, 0, 0, null);
	}
	
	public LoadImageApp() {
		try {
			img = ImageIO.read(new File("./image/dog.jpg"));
		} catch (IOException e) {		
		}
	}
	
	public Dimension getPreferredSize() {
		if (img == null) {
			return new Dimension(100, 100);
		} else {
			return new Dimension(img.getWidth(null), img.getHeight(null));
		}
	}
	
	public static void main(String args[]) {
		JFrame f = new JFrame("이미지 표시 예제");
		
		f.add(new LoadImageApp());
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
