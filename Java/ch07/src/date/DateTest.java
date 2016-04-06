package date;

class Date{
	int year, month, day;
	
	void print1(){
		System.out.printf("%d.%d.%d\n", year, month, day);
	}
	
	void print2(){
		if(month==1)
			System.out.printf("1월 %d, %d\n", day, year);
		else if(month==2)
			System.out.printf("2월 %d, %d\n", day, year);
		else if(month==3)
			System.out.printf("3월 %d, %d\n", day, year);
		else if(month==4)
			System.out.printf("4월 %d, %d\n", day, year);
		else if(month==5)
			System.out.printf("5월 %d, %d\n", day, year);
		else if(month==6)
			System.out.printf("6월 %d, %d\n", day, year);
		else if(month==7)
			System.out.printf("7월 %d, %d\n", day, year);
		else if(month==8)
			System.out.printf("8월 %d, %d\n", day, year);
		else if(month==9)
			System.out.printf("9월 %d, %d\n", day, year);
		else if(month==10)
			System.out.printf("10월 %d, %d\n", day, year);
		else if(month==11)
			System.out.printf("11월 %d, %d\n", day, year);
		else if(month==12)
			System.out.printf("12월 %d, %d\n", day, year);
		
	}
}

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		
		date.year = 2016;
		date.month = 4;
		date.day = 4;
		date.print1();
		date.print2();
	}

}
