package program9;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		char operator;
		int a, b, result = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("연산자 입력: ");
		operator = input.next().charAt(0);
		System.out.print("정수 입력: ");
		a = input.nextInt();
		System.out.print("정수 입력: ");
		b = input.nextInt();
		
		if(operator=='+'){
			result = a + b;
		}
		else if(operator=='-'){
			result = a - b;
		}
		else if(operator=='*'){
			result = a * b;
		}
		else if(operator=='/'){
			if(b!=0)
				result = a / b;
			else
				System.out.println("error");
		}
		
		System.out.printf("결과: %d\n", result);
		input.close();
		
		
	}

}
