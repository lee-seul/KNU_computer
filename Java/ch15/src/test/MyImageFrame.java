package test;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.Random;

public class MyImageFrame extends JFrame implements ActionListener{
	
	BufferedImage img;
	private int pieces = 4;
	private int totalPieces = pieces * pieces;
	private int[] pieceNumber;
	
	public MyImageFrame() {
		setTitle("Image Draw Test");
		try {
			img = ImageIO.read(new File("cat.jpeg"));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	
		pieceNumber = new int[totalPieces];
		for (int i = 0; i < totalPieces; i++)
			pieceNumber[i] = i;
		
		add(new MyPanel(), BorderLayout.CENTER);
		JButton button = new JButton("DIVIDE");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
		setSize(600, 600);
		setVisible(true);
	}
	
	void divide() {
		Random rand = new Random();
		int ri;
		
		for(int i = 0; i < totalPieces; i++){
			ri = rand.nextInt(totalPieces);
			int tmp = pieceNumber[i];
			pieceNumber[i] = pieceNumber[ri];
			pieceNumber[ri] = tmp;
		}
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int pieceWidth = img.getWidth(null) / pieces;
			int pieceHeight = img.getHeight(null) / pieces;
			for(int x = 0; x < pieces; x++) {
				int sx = x * pieceWidth;
				for (int y = 0; y < pieces; y++) {
					int sy = y * pieceHeight;
					int number = pieceNumber[x * pieces + y];
					int dx = (number / pieces) * pieceWidth;
					int dy = (number % pieces) * pieceHeight;
					g.drawImage(img, dx, dy, dx+pieceWidth, dy+pieceHeight, sx, sy, sx + pieceWidth, sy + pieceHeight, null);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new MyImageFrame();
	}
	
	public void actionPerformed(ActionEvent e) {
		divide();
		repaint();
	}

}
