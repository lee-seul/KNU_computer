package my8;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

class MyPanel8 extends JPanel{
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	public MyPanel8(){
		try{
			img = ImageIO.read(new File("car.gif"));
		} catch(IOException e){
			System.out.println("no image");
			System.exit(1);
		}
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
		});
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}


public class MyFrame8 extends JFrame{
	public MyFrame8(){
		add(new MyPanel8());
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame8();
	}

}
