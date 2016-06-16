package action5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame {
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	MyListener listener = new MyListener();

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event");
		panel = new JPanel();
		
		button1 = new JButton("yellow");
		button1.addActionListener(listener);
		panel.add(button1);
		
		button2 = new JButton("Pink");
		button2.addActionListener(listener);
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				panel.setBackground(Color.yellow);
			} else if (e.getSource() == button2) {
				panel.setBackground(Color.pink);
			}
		}
	}
}

public class ActionEvent4 {

	public void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
