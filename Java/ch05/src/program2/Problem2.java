package program2;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오:");
		a = input.nextInt();
		System.out.print("정수를 입력하시오:");
		b = input.nextInt();
		if(a>=b){
			System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다.", a, b, a/b, a%b);
		}
		else{
			System.out.printf("%d을 %d으로 나눈 몫은 %d이고 나머지는 %d입니다.", b, a, b/a, b%a);
		}
		
		input.close();
	}

}
