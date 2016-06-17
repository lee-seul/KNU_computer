package formatted;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

import java.awt.event.*;
import java.beans.*;
import java.util.Date;

class MyFrame extends JFrame implements PropertyChangeListener {
	private double amount = 100000;
	private Date date;
	
	private JFormattedTextField amountField;
	private JFormattedTextField dateField;
	
	public MyFrame() {
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Formatted");
		JPanel panel = new JPanel();
		
		amountField = new JFormattedTextField(new NumberFormatter());
		amountField.setValue(new Integer(100));
		amountField.setColumns(10);
		amountField.addPropertyChangeListener("value", this);
		
		panel.add(new JLabel("금액: "));
		panel.add(amountField);
		
		dateField = new JFormattedTextField(new DateFormatter());
		dateField.setValue(new Date());
		dateField.setColumns(10);
		dateField.addPropertyChangeListener("value", this);
		
		panel.add(new JLabel("날짜: "));
		panel.add(dateField);
		
		add(panel);
		setVisible(true);
	}
	
	public void propertyChange(PropertyChangeEvent e) {
		Object source = e.getSource();
		if(source == amountField) {
			amount = ((Number) amountField.getValue()).doubleValue();
			System.out.println(amount);
		} else if (source == dateField) {
			date = (Date) (dateField.getValue());
			System.out.println(date);
		}
	}
}

public class FormattedTextTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
