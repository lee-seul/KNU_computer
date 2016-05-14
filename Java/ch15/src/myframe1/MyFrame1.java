package myframe1;

import javax.swing.*;
import java.awt.*;

class MyPanel1 extends JPanel{
	
	public void PaintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("hi", 10, 10);
		g.drawLine(10, 20, 110, 20);
		g.drawRect(10, 30, 100, 100);
	}
}

public class MyFrame1 extends JFrame{
	public MyFrame1(){
		setTitle("MyFrame");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		MyPanel1 c = new MyPanel1();
		add(c);
	}
	public static void main(String[] args) {
		MyFrame1 frame = new MyFrame1();
	}

}
