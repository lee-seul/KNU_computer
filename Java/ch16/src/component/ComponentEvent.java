package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ComponentListener, FocusListener {
	JTextArea display;
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setTitle("Window Event Test");
		
		addComponentListener(this);
		addFocusListener(this);
		
		setVisible(true);
	}
	
	
	public void componentHidden(ComponentEvent e) {
		display("componentHidden() 호출");
	}

	public void componentMoved(ComponentEvent e) {
		display("componentMovedn() 호출");
	}
	
	public void componentResized(ComponentEvent e) {
		display("componentResized() 호출");
	}
	
	public void componentShown(ComponentEvent e) {
		display("componentShown() 호출");
	}
	
	public void focusGained(FocusEvent e) {
		display("focusGained() 호출");
	}

	public void focusLost(FocusEvent e) {
		display("focusLost() 호출");
	}

	private void display(String s) {
		System.out.println(s);
	}


	@Override
	public void componentResized(java.awt.event.ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentMoved(java.awt.event.ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentShown(java.awt.event.ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentHidden(java.awt.event.ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

}

public class ComponentEvent {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
