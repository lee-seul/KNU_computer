package add2;
import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int x, y, sum;
			
		System.out.println("첫번째 숫자를 입력하시오.");
		x = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오:");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
		input.close();

	}

}
