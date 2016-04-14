package plane;

class Plane{
	private int maxCapacity;
	private String model, producer;
	private int id;
	private static int planes = 0;
	
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
		id = ++planes;
		
	}
	public Plane(int m, String d){
		maxCapacity = m;
		model = d;
		producer = "Airbus";
		id = ++planes;
	}
	public Plane(int m){
		maxCapacity = m;
		model = "A380";
		producer = "Airbus";
		id = ++planes;
	}
	public Plane(){
		maxCapacity = 500;
		model = "A380";
		producer = "Airbus";
		id = ++planes;
	}
	
	public static int getPlanes(){
		return planes;
	}
}

public class PlaneTest {

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		Plane p3 = new Plane();
		
		p1.setMaxCapacity(100);
		p1.setModel("air1");
		p1.setProducer("11");
		
		p2.setMaxCapacity(100);
		p2.setModel("air2");
		p2.setProducer("22");
		
		p3.setMaxCapacity(100);
		p3.setModel("air3");
		p3.setProducer("33");
		
		System.out.printf("%d, %s, %s", p1.getMaxCapacity(), p1.getModel(), p1.getProducer());
		System.out.printf("%d, %s, %s", p2.getMaxCapacity(), p2.getModel(), p2.getProducer());
		System.out.printf("%d, %s, %s", p3.getMaxCapacity(), p3.getModel(), p3.getProducer());
		
		System.out.println(Plane.getPlanes());
	}

}
