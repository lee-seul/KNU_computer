package date;

class Date1 {
	private int year;
	private String month;
	private int day;
	public Date1(){
		month = "4월 ";
		day = 1;
		year = 2016;
	}
	
	public Date1(int year, String month, int day){
		setDate(year, month, day);
	}
	
	public Date1(int year){
		setDate(year, "1월", 1);
	}
	
	public void setDate(int year, String month, int day){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString(){
		return "Date[year=" + year +", month =" + month + ",day=" + day + "]";
	}
}

public class Date {

	public static void main(String[] args) {
		Date1 date1 = new Date1(2016, "3월", 2);
		Date1 date2 = new Date1(2020);
		Date1 date3 = new Date1();
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		

	}

}
