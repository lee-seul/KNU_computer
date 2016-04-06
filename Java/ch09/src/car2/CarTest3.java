package car2;

class Car{
	private String color;
	private int speed;
	private int gear;
	private int id;
	private static int numberOfCars = 0;
	
	public Car(String c, int s, int g){
		color = c;
		speed = s;
		gear = g;
		id = ++ numberOfCars;
	}
	
	public static int getNumberOfCars(){
		return numberOfCars;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 1);
		Car c2 = new Car("white", 0, 1);
		int n = Car.getNumberOfCars();
		System.out.println(n);
	}

}
