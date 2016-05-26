package checkbox;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxDemo extends JPanel implements ItemListener{
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = {"apple", "grape", "orange"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];
	public CheckBoxDemo(){
		super(new GridLayout(0,4));
		for (int i = 0; i < 3; i++){
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i] + ".gif");
		}
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for (int i = 0; i < 3; i ++)
			checkPanel.add(buttons[i]);
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
	}
	
	public void itemStateChanged(ItemEvent e) {
		ImageIcon image = null;
		Object source = e.getItemSelectable();
		for (int i = 0; i < 3; i++){
			if(source == buttons[i]){
				if(e.getStateChange() == ItemEvent.DESELECTED)
					pictureLabel[i].setIcon(null);
				else
					pictureLabel[i].setIcon(icon[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new CheckBoxDemo();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

}
