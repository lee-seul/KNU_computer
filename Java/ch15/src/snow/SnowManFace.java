package snow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel3 extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.BLACK);
		
		g.drawArc(60, 80, 50, 50, 180, -180);
		g.drawArc(150, 80, 50, 50, 180, -180);
		g.drawArc(70, 130, 100, 70, 180, 180);
	}
}

public class SnowManFace extends JFrame{
	public SnowManFace(){
		setSize(280, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("눈사람 얼굴");
		setVisible(true);
		add(new MyPanel3());
	}

	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();

	}

}
