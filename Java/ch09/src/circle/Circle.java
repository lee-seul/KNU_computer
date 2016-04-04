package circle;

class Point{
	private int x, y;
	public Point(int a, int b){
		x = a;
		y = b;
	}
}

class CircleClass{
	private int radius = 0;
	private Point center;
	
	public CircleClass(Point p, int r){
		center = p;
		radius = r;
	}
}

public class Circle {

	public static void main(String[] args) {
		Point p = new Point(25, 78);
		CircleClass c = new CircleClass(p, 10);
	}

}
