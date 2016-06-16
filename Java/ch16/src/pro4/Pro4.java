package pro4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Box extends JPanel {
	int x = 250, y = 30;
	public void move(int dx) {
		this.x += dx;
		repaint();
	}
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.red);
		setBackground(Color.YELLOW);
		g.fillRect(x, y, 20, 250);
	}
}

class MoveBox extends JFrame{
	private JPanel panel;
	private JButton button1, button2;
	public MoveBox() {
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("박스 움직이기");
		
		button1 = new JButton("왼쪽으로 이동");
		button2 = new JButton("오른쪽으로 이동");
		panel = new JPanel();
		
		Box panel1 = new Box();
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				panel1.move(-10);
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.move(10);
			}
		});
		
		panel.add(button1);
		panel.add(button2);
		

		
		add(panel1, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		
	
		setVisible(true);
	}
	

}

public class Pro4 {

	public static void main(String[] args) {
		MoveBox f = new MoveBox();
	}

}
