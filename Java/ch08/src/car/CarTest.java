package car;

class Car{
	private String color;
	private int speed;
	private int gear;
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color = c;
	}
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int s){
		speed = s;
	}
	public int getGear(){
		return gear;
	}
	public void setGear(int g){
		gear = g;
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println(myCar.getColor());
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.getGear());
	}

}
