package Chapter10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 람다식을 이용한 방법
class MyFrame5 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame5() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지않았습니다");
		
		button.addActionListener(e -> {
			label.setText("버튼이 눌려졌습니다.");
		});
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
		
		
	}
}

public class ActionEventTest5 {
	public static void main(String args[]) { 
		MyFrame5 t = new MyFrame5();
	}
}
