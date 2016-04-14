package student;

class Student{
	String name;
	int number;
	String major;
	int grade;
	int point;
	
	public Student(String n, int num, String m, int g, int p){
		name = n;
		number = num;
		major = m;
		grade = g;
		point = p;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setNumber(int n){
		number = n;
	}
	
	public void setMajor(String m){
		major = m;
	}
	
	public void setGrade(int g){
		grade = g;
	}
	
	public void setPoint(int p){
		point = p;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getMajor(){
		return major;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public int getPoint(){
		return point;
	}
	
	public void printThings(){
		System.out.printf("이름: %s, 학번: %d, 소속 학과 : %s, 학년: %d, 이수 학점: %d\n", 
				name, number, major, grade, point );
	}
}

class UnderGraduate extends Student{
	String club;
	
	public UnderGraduate(String n, int num, String m, int g, int p, String c){
		super(n, num, m, g, p);
		club = c;
	}
	
	public void setClub(String c){
		club = c;
	}
	
	public String getClub(){
		return club;
	}
	
	public void printThings(){
		System.out.printf("이름: %s, 학번: %d, 소속 학과 : %s, 학년: %d, 이수 학점: %d 동아리: %s\n", 
				name, number, major, grade, point, club );
	}
}

class Graduate extends Student{
	String type;
	double rate;
	
	public Graduate(String n, int num, String m, int g, int p, String t, double r){
		super(n, num, m, g, p);
		setType(t);
		setRate(r);
		
	}
	
	public void setType(String t){
		if(t.equals("교육 조교")  || t.equals("연구 조교"))
			type = t;
		else
			System.out.println("잘못된 값");
	}
	
	public void setRate(double r){
		if (r>=0 && r <=1)
			rate = r;
		else
			System.out.println("잘못된 값");
	}
	
	public String getType(){
		return type;
	}
	
	public double getRage(){
		return rate;
	}
	
	public void printThings(){
		System.out.printf("이름: %s, 학번: %d, 소속 학과 : %s, 학년: %d, 이수 학점: %d 조교 유형: %s, 장학금 비율: %f\n", 
				name, number, major, grade, point, type, rate );
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("name", 100, "major", 4, 55);
		UnderGraduate u = new UnderGraduate("name2", 200, "major2", 3, 35, "club");
		Graduate g = new Graduate("name2", 200, "major2", 3, 35, "연구 조교", 0.2);
		
		s.printThings();
		u.printThings();
		g.printThings();
		

	}

}
