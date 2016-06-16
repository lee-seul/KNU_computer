package counter;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class MyCounter extends JFrame implements ActionListener {
	private JLabel label, label1;
	private JButton button1, button2, button3;
	private int count = 0;
	
	public MyCounter() {
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);
		
		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel.add(label1);
		
		button1 = new JButton("plus");
		button1.addActionListener(this);
		button2 = new JButton("minus");
		button2.addActionListener(this);
		button3 = new JButton("0");
		button3.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		add(panel);
		setSize(300, 200);
		setTitle("My Counter");
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1) {
			count++;
			label1.setText(count + "");
		} else if (e.getSource() == button2) {
			count--;
			label1.setText(count + "");
		} else if (e.getSource() == button3) {
			count = 0;
			label1.setText(count + "");
		}
	}
}

public class CounterTest {

	public static void main(String[] args) {
		new MyCounter();
	}

}
