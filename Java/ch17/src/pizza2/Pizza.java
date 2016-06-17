package pizza2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Pizza extends JFrame implements ActionListener{
	private JLabel label;
	private JButton order, cancel; 
	private JPanel typePanel, toppingPanel, sizePanel, topPanel, bottomPanel;
	private JRadioButton combo, potato, bulgogi;
	private JRadioButton paprika, cheese, pepperoni, bacon;
	private JRadioButton small, medium, large;
	private JTextField price;
	
	public Pizza() {
		setSize(600, 200);
		setTitle("Pizza Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		label = new JLabel("자바 피자에 오신 것을 환영합니다");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		typePanel = new JPanel();
		combo = new JRadioButton("콤보");
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
		
		ButtonGroup type = new ButtonGroup();
		type.add(combo);
		type.add(potato);
		type.add(bulgogi);
		combo.addActionListener(this);
		potato.addActionListener(this);
		bulgogi.addActionListener(this);
		typePanel.add(combo);
		typePanel.add(potato);
		typePanel.add(bulgogi);
		
		Border typeBorder = BorderFactory.createTitledBorder("크기");
		typePanel.setBorder(typeBorder);
		
		add(typePanel, BorderLayout.EAST);
		
		toppingPanel = new JPanel();
		paprika = new JRadioButton("피망");
		cheese = new JRadioButton("치즈");
		pepperoni = new JRadioButton("페퍼로니");
		bacon = new JRadioButton("베이컨");
		
		ButtonGroup topping = new ButtonGroup();
		topping.add(paprika);
		topping.add(cheese);
		topping.add(pepperoni);
		topping.add(bacon);
		paprika.addActionListener(this);
		cheese.addActionListener(this);
		pepperoni.addActionListener(this);
		bacon.addActionListener(this);
		toppingPanel.add(paprika);
		toppingPanel.add(cheese);
		toppingPanel.add(pepperoni);
		toppingPanel.add(bacon);
		
		
		Border toppingBorder = BorderFactory.createTitledBorder("추가 토핑");
		toppingPanel.setBorder(toppingBorder);
		
		add(toppingPanel, BorderLayout.CENTER);
		
		toppingPanel = new JPanel();
		paprika = new JRadioButton("피망");
		cheese = new JRadioButton("치즈");
		pepperoni = new JRadioButton("페퍼로니");
		bacon = new JRadioButton("베이컨");
		
		ButtonGroup topping = new ButtonGroup();
		topping.add(paprika);
		topping.add(cheese);
		topping.add(pepperoni);
		topping.add(bacon);
		paprika.addActionListener(this);
		cheese.addActionListener(this);
		pepperoni.addActionListener(this);
		bacon.addActionListener(this);
		toppingPanel.add(paprika);
		toppingPanel.add(cheese);
		toppingPanel.add(pepperoni);
		toppingPanel.add(bacon);
		
		
		Border toppingBorder = BorderFactory.createTitledBorder("추가 토핑");
		toppingPanel.setBorder(toppingBorder);
		
		add(toppingPanel, BorderLayout.CENTER);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
