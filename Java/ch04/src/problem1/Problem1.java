package problem1;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		double mile;
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오:");
		mile = input.nextDouble();
		System.out.printf("%.0f마일은 %.3f입니다.\n", mile, mile*1.609);
		
		input.close();

	}

}
