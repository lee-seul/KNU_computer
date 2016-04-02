package problem4;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		int radius, height;
		final double PI = 3.141592;
		double size;
		Scanner input = new Scanner(System.in);
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		radius = input.nextInt();
		System.out.print("원기둥 높이를 입력하시오: ");
		height = input.nextInt();
		
		size = radius * radius * PI * height;
		System.out.printf("원기둥의 부피는 %.2f입니다. \n", size);
		
		input.close();
		
	}

}
