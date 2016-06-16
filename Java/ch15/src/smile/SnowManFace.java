package smile;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
	public void paintCoponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.black);
		g.drawArc(60, 80, 50, 50, 180, -180);
		g.drawArc(150, 80, 50, 50, 180, -180);
		g.drawArc(70, 130, 100, 70, 180, 180);
	}
}

public class SnowManFace extends JFrame{
	public SnowManFace() {
		setSize(280, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SnowMan");
		add(new MyPanel());
		setVisible(true);
		
	}
	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}

}
