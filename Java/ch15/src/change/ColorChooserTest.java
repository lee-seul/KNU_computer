package change;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorChooserTest extends JFrame implements ChangeListener {
	protected JColorChooser color;
	public ColorChooserTest() {
		setTitle("색상 선택기 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color = new JColorChooser();
		color.getSelectionModel().addChangeListener(this);
		color.setBorder(BorderFactory.createTitledBorder("색상 선택"));
		
		JPanel panel = new JPanel();
		panel.add(color);
		add(panel);
		pack();
		
		setVisible(true);
		
		
	}
	
	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
		System.out.println(newColor);
		
	}
	
	public static void main(String[] args) {
		new ColorChooserTest();
	}

}
