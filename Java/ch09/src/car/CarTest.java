package car;

class Car{
	private int speed;
	private int gear;
	private String color;
	
	public Car(String c, int s, int g){
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c){
		this(c, 0, 1);
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
