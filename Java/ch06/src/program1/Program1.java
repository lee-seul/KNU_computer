package program1;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		a = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = input.nextInt();
		
		if(a>=b){
			if (a<c){
				System.out.printf("%d, %d, %d\n", c,a, b);
			}
			else{
				if(c>b)
					System.out.printf("%d, %d, %d\n", a,c,b);
				else
					System.out.printf("%d, %d, %d\n", a,b,c);
			}
		}
		else{
			if(a>=c){
				System.out.printf("%d, %d, %d\n", b,a,c);
			}
			else{
				if(b<c){
					System.out.printf("%d, %d, %d\n", c,b,a);
				}
				else{
					System.out.printf("%d, %d, %d\n", b,c,a);
				}
			}
		}
		input.close();
	}

}
