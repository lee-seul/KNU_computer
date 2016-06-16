package more;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import javax.swing.*;

public class MoreShapes extends JFrame {
	public MoreShapes() {
		setSize(600, 130);
		setTitle("Java 2D Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MoreShapes();
	}
}

class MyPanel extends JPanel {
	ArrayList<Shape> ShapeArray = new ArrayList<Shape>();
	public MyPanel() {
		Shape s;
		
		s = new Rectangle2D.Float(10, 10, 70, 80);
		ShapeArray.add(s);
		
		s = new RoundRectangle2D.Float(110, 10, 70, 80, 20, 20);
		ShapeArray.add(s);
		
		s = new Ellipse2D.Float(210, 10, 80, 80);
		ShapeArray.add(s);
		
		s = new Arc2D.Float(310, 10, 80, 80, 90, 90, Arc2D.OPEN);
		ShapeArray.add(s);
		
		s = new Arc2D.Float(410, 10, 80, 80, 0, 180, Arc2D.OPEN);
		ShapeArray.add(s);
		
		s = new Arc2D.Float(510, 10, 80, 80, 45, 90, Arc2D.OPEN);
		ShapeArray.add(s);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(3));
		for (Shape s : ShapeArray)
			g2.draw(s);
			
	}
}
