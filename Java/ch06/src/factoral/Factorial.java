package factoral;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1;
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("정수를 입력하시오:");
		n = scan.nextInt();
		
		for(int i=1;i<=n;i++)
			fact = fact*i;
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
		scan.close();
	}

}
