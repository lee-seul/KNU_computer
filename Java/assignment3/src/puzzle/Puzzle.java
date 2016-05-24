package puzzle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PuzzleFrame extends JFrame {
	private JPanel panel1;
	private JPanel panel2;
	private JButton reset;
	private JButton[][] btn;
	MyListener listener = new MyListener();
	
	public PuzzleFrame() {
		
		this.setTitle("Puzzle");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		this.setLayout(new BorderLayout());
			
		panel1 = new JPanel();
		panel2 = new JPanel();
			
		panel1.setLayout(new GridLayout(0,3));
		panel2.setLayout(new BorderLayout());
			
		reset = new JButton("reset");
		reset.setBackground(Color.GREEN);
		reset.addActionListener(listener);
		
		// os x에서 JButton 배경 설정시
		// reset.setOpaque(true);
		// reset.setBorderPainted(false);
			
		panel2.add(reset, BorderLayout.CENTER);
		
		int count = 1;
		btn = new JButton[3][3];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				btn[i][j] = new JButton("" + count);
				btn[i][j].addActionListener(listener);
				panel1.add(btn[i][j]);
				count++;
			}
		}
		btn[2][2].setVisible(false);
			
		this.add(panel1, BorderLayout.CENTER);
		this.add(panel2, BorderLayout.PAGE_END);
		this.pack();
		this.setVisible(true);
		
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("reset")){
				int count = 1;
				for (int i = 0; i < 3; i++){
					for (int j = 0; j < 3; j++){
						btn[i][j].setText(""+count);
						if(count==9)
							btn[i][j].setVisible(false);
						else
							btn[i][j].setVisible(true);
						count++;
					}
				}
				repaint();
			}
			else {
				int value = Integer.parseInt(e.getActionCommand());
				int x =0 , y = 0;
				for(int i = 0; i < 3; i++){
					for (int j =0; j <3; j++){
						if((btn[i][j].getText()).equals("" + value)){
							x = i;
							y = j;
						}
					}
				}
				
				if((x-1)>=0){
					if((btn[x-1][y].getText()).equals("9")){
						btn[x-1][y].setText(btn[x][y].getText());
						btn[x-1][y].setVisible(true);
						btn[x][y].setText("9");
						btn[x][y].setVisible(false);
						repaint();
					}
				}
				
				if ((x+1)<=2){
					if ((btn[x+1][y].getText()).equals("9")){
						btn[x+1][y].setText(btn[x][y].getText());
						btn[x+1][y].setVisible(true);
						btn[x][y].setText("9");
						btn[x][y].setVisible(false);
						repaint();
					}
				}
				
				if ((y+1)<=2){
					if ((btn[x][y+1].getText()).equals("9")){
						btn[x][y+1].setText(btn[x][y].getText());
						btn[x][y+1].setVisible(true);
						btn[x][y].setText("9");
						btn[x][y].setVisible(false);
						repaint();
					}
				}
				
				if((y-1)>=0){
					if ((btn[x][y-1].getText()).equals("9")){
						btn[x][y-1].setText(btn[x][y].getText());
						btn[x][y-1].setVisible(true);
						btn[x][y].setText("9");
						btn[x][y].setVisible(false);
						repaint();
					}
				}
			}
		}
	}
}

public class Puzzle {
	public static void main(String[] args) {
		PuzzleFrame f = new PuzzleFrame();
	}

}
