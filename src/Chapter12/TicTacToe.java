package Chapter12;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacToe extends JPanel implements ActionListener {
	private JButton[][]buttons;
	private char turn = 'X';
	
	TicTacToe() {
		setLayout(new GridLayout(3, 3));
		Font f = new Font("Dialog", Font.ITALIC, 50);
		buttons = new JButton[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this);
				add(buttons[i][j]);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 3; i++) {
			for (int j =0; j < 3; j++) {
				if(e.getSource() == buttons[i][j] &&
						buttons[i][j].getText().equals(" ") == true) {
					if (turn == 'X') {
						buttons[i][j].setText(turn + "");
						
						if(checkWin(i, j, "X"))
							System.out.println("Winner is X!");
						
						turn = 'O';
					} else if (turn == 'O') {
						buttons[i][j].setText(turn + "");
						
						if(checkWin(i, j, "O")) 
							System.out.println("Winner is O!");
						
						turn = 'X';
					}
				}
			}
		}
	}
	
	public boolean checkWin(int r, int c, String mark) {
		return (buttons[r][0].getText().equals(mark)
				&& buttons[r][1].getText().equals(mark)
				&& buttons[r][2].getText().equals(mark)
				|| buttons[0][c].getText().equals(mark)
				&& buttons[1][c].getText().equals(mark)
				&& buttons[2][c].getText().equals(mark)
				|| buttons[0][0].getText().equals(mark)
				&& buttons[1][1].getText().equals(mark)
				&& buttons[2][2].getText().equals(mark)
				|| buttons[2][0].getText().equals(mark)
				&& buttons[1][1].getText().equals(mark)
				&& buttons[0][2].getText().equals(mark));
	}
	
	public static void main(String args[]) {
		JFrame f = new JFrame();
		JPanel panel = new TicTacToe();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(panel);
		f.setVisible(true);
		f.setSize(300, 300);
	}
}
