package Chapter10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame3 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	
	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label.setText("마침내 버튼이 눌려졌습니다.");
		}
	}
}

public class ActionEventTest3 {
	public static void main(String args[]) {
		MyFrame3 t = new MyFrame3();
	}
}
