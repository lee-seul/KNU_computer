package problem3;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		double radius, size;
		Scanner input = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		radius = input.nextDouble();
		size = 4/3*Math.pow(radius, 3);
		System.out.printf("부피: %.2f", size);
		
		input.close();
	}

}
