package manage;

class Employee{
	public String name;
	String address;
	protected int salary;
	protected int RRN;
	public String toString(){
		return name+ ", " + address + ", " + RRN + ", " + salary;
	}
}

class Manager extends Employee{
	private int bonus;
	public void printSalary(){
		System.out.println(name+ "(" + address + "):" + (salary + bonus));
	}
	
	public void printRRN(){
		System.out.println(RRN);
	}
}

public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "홍길동";
		m.address = "대구광역시";
		m.RRN = 931007;
		m.salary = 3450000;
		System.out.println(m);
		m.printSalary();
		m.printRRN();

	}

}
