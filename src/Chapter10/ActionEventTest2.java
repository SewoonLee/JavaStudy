package Chapter10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// MyFrame 클래스가 이벤트를 처리
class MyFrame2 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame2() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	
	// 내부 클래스로 MyListener 정의
	public class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				label.setText("마침내 버튼이 눌려졌습니다.");
				
			JButton button = (JButton) e.getSource();
			button.setText("마침내 버튼이 눌려졌습니다.");
			}
		}
	}
}



public class ActionEventTest2 {
	public static void main(String args[]) {
		MyFrame2 t = new MyFrame2();
	}
}
