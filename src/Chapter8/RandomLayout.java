package Chapter8;
import javax.swing.*;
import java.awt.*;


public class RandomLayout extends JFrame{
	JPanel p1 = new JPanel();
	JLabel[] labels = new JLabel[30];
	
	public RandomLayout() {
		p1.setLayout(null);
		p1.setBackground(Color.yellow);
		
		for (int i = 0; i < 30; i++) {
			labels[i] = new JLabel("" + i); // 	new JLabel ?? why??
			int x = (int) (500 * Math.random());
			int y = (int) (200 * Math.random());
			labels[i].setBounds(x, y, 20, 20);
			labels[i].setForeground(Color.RED);
			p1.add(labels[i]);
		}
		setSize(500, 300);
		add(p1);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		RandomLayout r = new RandomLayout();
	}
}
