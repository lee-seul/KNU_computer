package car;

class Car4{
	private String model;
	public Car4(String model){
		this.model = model;
	}
	public boolean equals(Object obj){
		if(obj instanceof Car4)
			return model.equals(((Car4)obj).model);
		else
			return false;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car4 firstCar = new Car4("HMW520");
		Car4 secondCar = new Car4("HMW520");
		
		if(firstCar.equals(secondCar)){
			System.out.println("동일한 종류의 자동차입니다.");
		}
		else {
			System.out.println("동일한 종류의 자동차가 아닙니다. ");
		}
	}

}
