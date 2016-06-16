package fill;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class MyComponent extends JComponent {
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setStroke(new BasicStroke(3));
		GradientPaint gp = new GradientPaint(0, 10, Color.WHITE, 0, 70, Color.red);
		
		g2.setPaint(Color.red);
		g2.fill(new Rectangle2D.Float(10, 10, 70, 80));
		g2.setPaint(gp);
		
	}
}

public class FillShape {

	public static void main(String[] args) {
		MyComponent m = new MyComponent();
		
	}

}
