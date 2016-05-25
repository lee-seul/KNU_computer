package frame1;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hello", 10, 10);
		g.drawLine(10, 20, 110, 20);
		g.drawRect(10, 30, 100, 100);
	}
}

public class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("MyFrame");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p = new MyPanel();
		add(p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
