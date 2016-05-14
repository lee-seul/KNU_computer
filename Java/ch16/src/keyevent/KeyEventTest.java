package keyevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame5 extends JFrame implements KeyListener{
	
	public MyFrame5(){
		setTitle("event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		add(tf);
		setVisible(true);
	}

	public void keyTyped(KeyEvent e){
		display(e, "KeyTyped");
	}
	
	public void keyPressed(KeyEvent e){
		display(e, "KeyPressed");
	}
	
	public void KeyReleased(KeyEvent e){
		display(e, "KeyReleased");
	}
	
	protected void display(KeyEvent e, String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + "" + e.isControlDown() + "" + e.isShiftDown();
		System.out.println(s + "" + c + "" + keyCode + "" + modifiers);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class KeyEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame5 t = new MyFrame5();
	}

}
