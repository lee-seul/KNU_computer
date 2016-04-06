package problem4;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		double c, f;
		Scanner input = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하세요: ");
		f = input.nextDouble();
		c = (f-32)*5/9;
		System.out.printf("섭씨 온도: %.2f\n", c);
		input.close();

	}

}
