package my6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame6 extends JFrame implements MouseListener, MouseMotionListener{
	
	public MyFrame6(){
		setTitle("Mouse Event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		add(panel);
		setVisible(true);
	}
	
	public void mousePressed(MouseEvent e){
		display("Mouse pressed (# of click: " + e.getClickCount() + ")", e);
	}
	
	public void mouseReleased(MouseEvent e){
		display("Mouse Released (# of click: " + e.getClickCount() + ")", e);
	}
	public void mouseEntered(MouseEvent e){
		display("Mouse Entered (# of click: " + e.getClickCount() + ")", e);
	}
	public void mouseExited(MouseEvent e){
		display("Mouse Exited (# of click: " + e.getClickCount() + ")", e);
	}
	public void mouseClicked(MouseEvent e){
		display("Mouse Clicked (# of click: " + e.getClickCount() + ")", e);
	}
	
	protected void display(String s, MouseEvent e){
		System.out.println(s + " X=" + e.getX() + "Y=" + e.getY());
	}

	public void mouseDragged(MouseEvent e){
		display("Mouse dragged", e);
	}
	public void mouseMoved(MouseEvent e){
		display("Mouse moved", e);
	}
}

public class MyFrameTest6 {

	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();
	}

}
