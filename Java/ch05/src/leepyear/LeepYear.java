package leepyear;
import java.util.Scanner;

public class LeepYear {

	public static void main(String[] args) {
		int year;
		boolean isLeapYear;
		
		Scanner input = new Scanner(System.in);
		System.out.print("년도를 입력하시오: ");
		year = input.nextInt();
		
		isLeapYear = ((year % 4 == 0) && !(year % 100 ==0)) || (year % 400 == 0);
		
		System.out.print(isLeapYear);
		input.close();

	}

}
