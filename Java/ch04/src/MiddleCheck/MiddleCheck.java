package MiddleCheck;
import java.util.Scanner;

public class MiddleCheck {
	public static void main(String[] args) {
		double won, dollar;
		Scanner input = new Scanner(System.in);
		System.out.print("원화를 입력하시오:");
		won = input.nextDouble();
		dollar = won / 1230.0;
		System.out.println(dollar);
		
		input.close();

	}

}
