package nframe4;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello?");
		JButton button = new JButton("button");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
}

public class MyFrameTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
