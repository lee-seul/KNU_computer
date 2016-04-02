package program5;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		double x, result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("x입력: ");
		x = input.nextDouble();
		
		if(x<=0){
			result = Math.pow(x, 3) + x * 9 + 2;
		}
		else{
			result = x * 7 + 2;
		}
		
		System.out.printf("결과: %f\n", result);
		
		input.close();
	}

}
