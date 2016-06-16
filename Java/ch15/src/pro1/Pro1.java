package pro1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyPanel extends JPanel {
	Font f1, f2, f3, f4, f5;
	
	public MyPanel() {
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("San Serif", Font.BOLD, 20);
		f3 = new Font("Monospaced", Font.ITALIC, 20);
		f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
		f5 = new Font("DialogInput", Font.BOLD, 20);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < 10; i++) {
			g.setFont(f1);
			Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255),
					(int) (Math.random() * 255));
			g.setColor(color);
			g.drawString("Hello World", 10, 50+i*20);
		}
	}
}

public class Pro1 extends JFrame{
	public Pro1() {
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Font Test");
		JPanel panel = new MyPanel();
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		Pro1 s = new Pro1();
	}

}
