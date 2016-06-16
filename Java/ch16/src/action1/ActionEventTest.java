package action1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("finally button is clicked");
	}
}

class MyFrame extends JFrame {
	private JButton button;
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("example event");
		this.setLayout(new FlowLayout());
		button = new JButton("click the button");
		button.addActionListener(new MyListener());
		this.add(button);
		this.setVisible(true);
	}
}

public class ActionEventTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
