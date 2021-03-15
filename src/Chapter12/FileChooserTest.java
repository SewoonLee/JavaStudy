package Chapter12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileChooserTest extends JFrame implements ActionListener {
	JButton openButton, saveButton;
	JFileChooser fc;
	
	
	public FileChooserTest() {
		setTitle("파일 선택기 테스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		
		fc = new JFileChooser();
		
		JLabel label = new JLabel("파일 선택기 컴포넌트 테스트입니다.");
		openButton = new JButton("파일 오픈");
		openButton.addActionListener(this);
		
		saveButton = new JButton("파일 저장");
		saveButton.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(openButton);
		panel.add(saveButton);
		add(panel);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e ) {
		if (e.getSource() == openButton) {
			int returnVal = fc.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
			} else {
				
			}
		} else if (e.getSource() == saveButton) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
			} else {
				
			}
		}
	}
	
	public static void main(String[] args) {
		FileChooserTest frame = new FileChooserTest();
	}
}
