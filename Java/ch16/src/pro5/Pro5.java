package pro5;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Translator extends JFrame {
	private JLabel label;
	public Translator() {
		setSize(700, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("번역기");
		
		label = new JLabel("Don't cry before you are hurt");
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
		label.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent arg0) {
				super.mouseExited(arg0);
				label.setText("Don't cry before you are hurt");
			}
			
			public void mouseEntered(MouseEvent arg0) {
				label.setText("다치기 전에 울지말라");
			}
		});
		
		add(label);
		setVisible(true);
	}
}

public class Pro5 {

	public static void main(String[] args) {
		Translator t = new Translator();
	}

}
