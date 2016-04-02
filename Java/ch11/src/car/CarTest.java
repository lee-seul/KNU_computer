package car;

class Car{
	private String model;
	private String color;
	private int speed;
	private int id;
	static int numbers = 0;
	public Car(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		id=++numbers;
		
	}
}


public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("E600", "White", 80);
		Car c2 = new Car("E500", "blue", 20);
		int n = Car.numbers;
		System.out.println("지금까지 생성된 자동차수 = " + n);

	}

}
