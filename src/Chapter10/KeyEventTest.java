package Chapter10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	private JButton button;
	
	public KeyEventTest() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel(new GridLayout(0, 3));
		panel.add(new JLabel("문자를 입력하시오: "));
		
		field = new JTextField(5);
		panel.add(field);
		
		button = new JButton("초기화");
		button.addActionListener(e -> {
			area.setText("");
		});
		panel.add(button);
		
		area = new JTextArea(3, 30);
		
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		
		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400, 200);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new KeyEventTest();
	}
	
	public void keyTyped(KeyEvent e) {
		display(e, "Key Typed		");
	}
	
	public void keyPressed(KeyEvent e) {
		display(e, "Key Pressed		");
	}
	
	public void keyReleased(KeyEvent e) {
		display(e, "Key Redlased ");
	}
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: " + e.isControlDown() + "Shift: " + e.isShiftDown();
		
		area.append(" " + s + "문자 " + c + "(코드: " + keyCode + ") " + modifiers + "\n");
	}
	
	
}
