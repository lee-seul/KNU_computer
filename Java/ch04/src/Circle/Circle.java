package Circle;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		double radius, area;
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오: ");
		radius = input.nextDouble();
		area = 3.14 * Math.pow(radius, 2);
		
		System.out.println(area);
		input.close();
	}

}
