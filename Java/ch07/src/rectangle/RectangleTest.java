package rectangle;

class Rectangle{
	int w, h;
	
	int area(){
		return w*h;
	}
	
	int perimeter(){
		return (w+h)*2;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		
		rectangle.h = 10;
		rectangle.w = 8;
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		
		
	}

}
