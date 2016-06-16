package pizza2;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(600, 150);
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		//panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(Color.blue);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.green);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.cyan);
		
		JLabel label = new JLabel();
		label.setText("Welcome   to   Java   Pizza");
		
		panel1.add(label);
		
		JButton b1 = new JButton("combo");
		JButton b2 = new JButton("potato");
		JButton b3 = new JButton("bulgogi");
		
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		
		panel.add(panel1);
		panel.add(panel2);
		add(panel);
		
		setVisible(true);
		
	}
}

public class MyFrameTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
