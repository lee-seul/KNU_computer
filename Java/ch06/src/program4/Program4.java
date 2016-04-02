package program4;
import java.util.Scanner;

public class Program4 {

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
				System.out.printf("b: %d\n", b);
			}
			else{
				if(c>b)
					System.out.printf("b: %d\n", b);
				else
					System.out.printf("c: %d\n", c);
			}
		}
		else{
			if(a>=c){
				System.out.printf("c: %d\n", c);
			}
			else{
				if(b<c){
					System.out.printf("a: %d\n", a);
				}
				else{
					System.out.printf("a: %d\n", a);
				}
			}
		}
		input.close();
	}

}
