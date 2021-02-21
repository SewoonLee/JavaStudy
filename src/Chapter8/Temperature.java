package Chapter8;
import javax.swing.*;

public class Temperature {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		
		JButton button = new JButton("변환");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		f.setSize(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");
		f.setVisible(true);
		
		
	}
}
