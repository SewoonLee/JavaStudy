package Chapter10;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacToe extends JPanel implements ActionListener{
	private JButton[][] buttons = new JButton[3][3];
	private String[][] board = new String[3][3];
	private char turn = 'X';
	
	public TicTacToe() {
		setLayout(new GridLayout(3, 3));
		Font f = new Font("Dialog", Font.ITALIC, 50);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this);
				add(buttons[i][j]);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i =0; i < 3 ; i++) {
			for (int j =0; j < 3 ; j++) {
				if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
					if (turn == 'X') { 
						buttons[i][j].setText("X");
						board[i][j] = "X";
						
						if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) 
							System.out.println(turn + " Win!");
						else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) 
							System.out.println(turn + " Win!");
						else {
							for (int k = 0; k < 3; k++) {
								if (board[k][0].equals(board[k][1]) && board[k][1].equals(board[k][2])) 
									System.out.println(turn + " Win!");
								else if (board[0][k].equals(board[1][k]) && board[1][k].equals(board[2][k]))
									System.out.println(turn + " Win!");
							}
						}
						
						turn = 'O';
					}else {
						buttons[i][j].setText("O");
						board[i][j] = "O";
						
						if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) 
							System.out.println(turn + " Win!");
						else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) 
							System.out.println(turn + " Win!");
						else {
							for (int k = 0; k < 3; k++) {
								if (board[k][0].equals(board[k][1]) && board[k][1].equals(board[k][2])) 
									System.out.println(turn + " Win!");
								else if (board[0][k].equals(board[1][k]) && board[1][k].equals(board[2][k]))
									System.out.println(turn + " Win!");
							}
						}
						
						turn = 'X';
					}
					
					
				}
			}
		}
	}
	
	public static void main(String args[]) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new TicTacToe());
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
