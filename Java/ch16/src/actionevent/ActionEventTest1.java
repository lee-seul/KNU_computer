package actionevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton)e.getSource();
		button.setText("press");
	}
}

class MyFrame1 extends JFrame{
	private JButton button;
	public MyFrame1(){
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("event");
		this.setLayout(new FlowLayout());
		button = new JButton("here");
		button.addActionListener(new MyListener());
		this.add(button);
		this.setVisible(true);
	}
}

public class ActionEventTest1 {

	public static void main(String[] args) {
		MyFrame1 t = new MyFrame1();
		
	}

}
