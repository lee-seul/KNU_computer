package pro2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Rate extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel label1, label2;
	private JTextField tf1, tf2, tf3;
	private JButton button;
	
	public Rate() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		
		panel = new JPanel();
		label1 = new JLabel("원금을 입력하시오");
		tf1 = new JTextField(10);
		
		panel.add(label1);
		panel.add(tf1);
		
		label2 = new JLabel("이율을 입력하시오");
		tf2 = new JTextField(10);
		
		panel.add(label2);
		panel.add(tf2);
		
		button = new JButton("변환");
		button.addActionListener(this);
		
		panel.add(button);
		tf3 = new JTextField(20);
		
		panel.add(tf3);
		
		add(panel);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(tf1.getText() == null || tf2.getText() == null)
			tf3.setText("두개를 모두 입력하세요");
		else
			tf3.setText("이자는 연 " + (Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText()))/ 100
					+ "만원입니다.");
		
			
	}
}


public class Pro2 {

	public static void main(String[] args) {
		Rate r = new Rate();
	}

}
