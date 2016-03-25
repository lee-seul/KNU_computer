package cartest;

class Car{
	String color;
	int speed;
	int gear;
	void print(){
		System.out.println("(" + color + "," + speed + "," + gear + ")");
	}
}


public class Cartest {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();

	}

}
