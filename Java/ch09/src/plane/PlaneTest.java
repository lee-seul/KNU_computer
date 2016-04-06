package plane;

class Plane{
	private int maxCapacity;
	private String model, producer;
	private int id;
	private static int count = 0;
	
	public void setMaxCapacity(int m){
		maxCapacity = m;
	}
	public int getMaxCapacity(){
		return maxCapacity;
	}
	public void setModel(String m){
		model = m;
	}
	public String getModel(){
		return model;
	}
	public void setProducer(String p){
		producer = p;
	}
	public String getProducer(){
		return producer;
	}
	
	public Plane(int m, String d, String p){
		maxCapacity = m;
		model = d;
		producer = p;
		id = ++count;
		
	}
	public Plane(int m, String d){
		maxCapacity = m;
		model = d;
		producer = "Airbus";
		id = ++count;
	}
	public Plane(int m){
		maxCapacity = m;
		model = "A380";
		producer = "Airbus";
		id = ++count;
	}
	public Plane(){
		maxCapacity = 500;
		model = "A380";
		producer = "Airbus";
		id = ++count;
	}
	
	public static int getPlanes(){
		return count;
	}
}

public class PlaneTest {

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		Plane p3 = new Plane();
		Plane p4 = new Plane();
		
		System.out.println(Plane.getPlanes());
	}

}
