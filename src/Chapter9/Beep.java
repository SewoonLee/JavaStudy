package Chapter9;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Timer;

class MyClass implements ActionListener {
	int i = 0;
	
	public void actionPerformed(ActionEvent evnet) {
		System.out.println(i++);
	}
}

public class Beep {
	public static void main(String args[]) {

		ActionListener listener = new MyClass();
		Timer t = new Timer(1000, listener);
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
