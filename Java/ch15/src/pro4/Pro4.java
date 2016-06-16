package pro4;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

class House extends JPanel {
	public House() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.black);
		g2.draw(new Rectangle2D.Float(50, 50, 200, 200));
		g2.draw(new Rectangle2D.Float(150, 150, 50, 100));
		g2.draw(new Rectangle2D.Float(75, 75, 20, 20));
		g2.draw(new Line2D.Float(150, 20, 50, 50));
		g2.draw(new Line2D.Float(150, 20, 250, 50));
		
	}
}

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 300);
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		House h = new House();
		h.setBounds(0, 0, 300, 300);
		add(h);
		setVisible(true);
	}
}

public class Pro4 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
