package pro1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
	private JLabel label;
	private JTextField tf1, tf2;
	private JButton button;
	private JPanel panel;
	
	public MyFrame() {
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mile to killometer");
		
		panel = new JPanel();
		
		label = new JLabel("거리를 마일 단위로 입력하시오");
		tf1 = new JTextField(10);
		tf2 = new JTextField(20);
		button = new JButton("변환");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(tf1);
		panel.add(button);
		panel.add(tf2);
		
		add(panel);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		float value = 0.0f;
		if(tf1.getText() == null)
			tf2.setText("값을 입력하세요");
		else
			value = Integer.parseInt(tf1.getText());
			tf2.setText((int)value + "마일은 " + value*1.6 + "킬로미터입니다.");
	}
}

public class Pro1 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
