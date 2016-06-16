package car;

import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("cat.jpeg"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		
		addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e){
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class CarGameTest extends JFrame {
	public CarGameTest() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGameTest s = new CarGameTest();
	}

}
