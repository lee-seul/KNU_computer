package nframe6;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1);
		panel.add(t2);
		
		add(panel);
		setVisible(true);
	}
}

public class MyFrameTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
