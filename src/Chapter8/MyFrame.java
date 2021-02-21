package Chapter8;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class MyFrame extends JFrame {
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
//		Dimension screenSize = kit.getScreenSize();
		
		setSize(300, 200);
//		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		
		setVisible(true);
	}
}
