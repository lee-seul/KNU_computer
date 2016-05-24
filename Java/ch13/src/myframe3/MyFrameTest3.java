package myframe3;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요?");
		JButton button = new JButton("버튼");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
}

public class MyFrameTest3 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
