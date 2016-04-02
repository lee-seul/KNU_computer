package point;

class Point{
	private int x, y;
	
	public Point(int a, int b){
		x = a;
		y =b;
	}
	
	public String toString(){
		return "Point [x=" + x + ",y=" + y+ "]";
	}
}


class Circle{
	private int radius = 0;
	private Point center;
	
	public Circle(Point p, int r){
		center = p;
		radius = r;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + ",center=" + center + "]";
	}
}

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		System.out.println(c);

	}

}
