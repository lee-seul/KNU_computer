package thermometer;

import java.awt.event.*;
import javax.swing.*;

class ThermometerFrame extends JFrame{
	private JButton button;
	private JLabel label1;
	private JLabel label2;
	private JTextField field1;
	private JTextField field2;
	
	public ThermometerFrame(){
		JPanel panel = new JPanel();
		this.add(panel);
		button = new JButton("변환");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(!(field1.getText().equals(""))){
					int c = (int)(((Double.parseDouble(field1.getText())) -32) * 5/9);
					field2.setText(c+"");
				}
				else if((field1.getText().equals("")) && !(field2.getText().equals(""))){
					int f = (int)((Double.parseDouble(field2.getText())) * 1.8 + 32);
					field1.setText(f+"");
				}
			}
		});
		label1 = new JLabel("화씨 온도");
		label2 = new JLabel("섭씨 온도");
		field1 = new JTextField(15);
		field2 = new JTextField(15);
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("온도변환기");
		this.setVisible(true);
	}
	
}


public class Thermometer {

	public static void main(String[] args) {
		ThermometerFrame t = new ThermometerFrame();
	}

}
