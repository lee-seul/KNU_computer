package keyevent2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyFrame extends JFrame implements KeyListener {
	
	public MyFrame() {
		setTitle("Event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		
		add(tf);
		setVisible(true);
	}
	
	public void keyTyped(KeyEvent e) {
		display(e, "KeyTyped");
	}
	
	public void keyPressed(KeyEvent e) {
		display(e, "KeyPressed");
	}
	
	public void keyReleased(KeyEvent e) {
		display(e, "KeyReleased");
	}
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " +
				e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
	}
	
	
}

public class KeyEvent {

	public static void main(String[] args) {

	}

}
