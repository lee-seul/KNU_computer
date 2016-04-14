package human;

class Human{
	String name;
	int age;
	
	public Human(String n, int a){
		name = n;
		age = a;
		System.out.println("부모 클래스 생성자 호출 ");
	}
	
	
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String toString(){
		return "이름은 " + name + ", 나이는 " + age + "입니다.";
	}
	
	public String getProfession(){
		return " ";
	}
	

}

class Student extends Human{
	String major;
	String profession;
	
	public Student(String n, int a, String m){
		super(n, a);
		major= m;
		profession = "학생";
		System.out.println("자식 클래스 생성자 호출 ");
	}
	
	public void setMajor(String m){
		major = m;
	}
	
	public String getMajor(){
		return major;
	}
	
	public String toString(){
		return "전공은 " + major + " " + super.toString(); 
	}
	
	public String getProfession(){
		return profession;
	}
}


public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human("춘향", 18);
		Human h2 = new Human("몽룡", 21);
		Human h3 = new Human("사또", 50);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		
		Student s1 = new Student("명진", 21, "컴퓨터");
		Student s2 = new Student("미현", 22, "경영");
		Student s3 = new Student("용준", 24, "경제");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
	}

}
