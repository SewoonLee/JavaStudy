package Chapter8;
import java.awt.Color;

import javax.swing.*;

public class JavaPizza {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		
		JPanel panel = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		panel.add(p1);
		panel.add(p2);
		
		f.add(panel);
		
		
		
		JLabel label = new JLabel("자바피자에 오신것을 환영합니다. 피자의 종류를 선택하시오.");
		p1.add(label);
		
		JButton b1 = new JButton("콤보피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		JLabel l1 = new JLabel("개수");
		JTextField field = new JTextField(20);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(l1);
		p2.add(field);
		
//		panel.setBackground(Color.blue);
//		p1.setBackground(Color.red);
//		p2.setBackground(Color.CYAN);

		f.setSize(600, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("JavaPizza");
		f.setVisible(true);
		
		
		
	}
}
