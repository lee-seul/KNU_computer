package circle2;

class Circle{
	private double radius;
	private static double PI = 3.141592;
	
	public Circle(double r){
		radius = r;
	}
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	private double square(double value){
		return value*value;
	}
	
	public double getArea(){
		return PI*square(radius);
	}
	
	public double getPerimeter(){
		return PI*radius*2;
	}
	
	public static double getPI(){
		return PI;
	}
	
	//public class Circle{
	//	public static void main(String[] args){
	//		square(10.0);
	//	}
	//}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		System.out.println("면적: " + c.getArea());
		System.out.println("둘레: " + c.getPerimeter());
	}

}
