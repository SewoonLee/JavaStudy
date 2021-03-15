package Chapter11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrayScaleImage  extends JFrame {
	BufferedImage image;
	int width;
	int height;
	
	public GrayScaleImage() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			File input = new File("./image/Lenna.png");
			image = ImageIO.read(input);
			width = image.getWidth();
			height = image.getHeight();
			
			for (int r = 0; r < height; r++) {
				for (int c = 0; c <width; c++) {
					
					Color color = new Color(image.getRGB(r, c));
					
					int red = (int) (color.getRed());
					int green = (int) (color.getGreen());
					int blue = (int) (color.getBlue());
					
					int avg = (red + green + blue) / 3;
					Color newColor = new Color(avg, avg, avg);
					
					image.setRGB(r, c, newColor.getRGB());
				}
			}
			
			File output = new File("output.png");
			ImageIO.write(image, "png", output);
			add(new GrayScalePanel());
			pack();
			setVisible(true);
			
		} catch (Exception e) {
			System.out.println("이미지 일기 실패!");
		}
	}
	
	class GrayScalePanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
		
		public Dimension getPreferredSize() {
			if (image == null) {
				return new Dimension(100, 100);
			} else { 
				return new Dimension(image.getWidth(null), image.getHeight(null));
			}
		}
	}
	
	static public void main(String[] args) throws Exception {
		GrayScaleImage obj = new GrayScaleImage();
	}
}
