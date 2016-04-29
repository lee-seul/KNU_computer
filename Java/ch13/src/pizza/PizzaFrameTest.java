package pizza;

import javax.swing.*;

class PizzaFrame extends JFrame{
	
	public PizzaFrame(){
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("welcome to java world. choose type of pizza.");
		panelA.add(label1);
		
		JButton button1 = new JButton("Combo Pizza");
		JButton button2 = new JButton("Potato Pizza");
		JButton button3 = new JButton("Bulgogi Pizza");
		
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("number");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
}

public class PizzaFrameTest {

	public static void main(String[] args) {
		PizzaFrame f = new PizzaFrame();
	}

}
