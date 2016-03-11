package Salary;
import java.util.Scanner;


public class Salary {
	public static void main(String[] args) {
		int salary, deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("월급을 입력하시오: ");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.printf("10년 동안의 저축액은 %d\n", deposit);
		input.close();
	}

}
