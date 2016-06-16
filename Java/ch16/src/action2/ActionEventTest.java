package action2;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Test");
		JPanel panel = new JPanel();
		button = new JButton("click the button");
		label = new JLabel("button isn't clicked yet");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	
	public class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				label.setText("Finally button is clicked");
			}
		}
	}
}

public class ActionEventTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
