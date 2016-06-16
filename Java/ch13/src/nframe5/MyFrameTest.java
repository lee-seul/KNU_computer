package nframe5;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(500, 200);
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		b1.setText("left");
		JButton b2 = new JButton("center");
		JButton b3 = new JButton("right");
		b3.setEnabled(false);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		add(panel);
		setVisible(true);
		
	}
}

public class MyFrameTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
