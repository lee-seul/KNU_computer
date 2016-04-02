package program10;
import java.util.Scanner;


public class Program10 {

	public static void main(String[] args) {
		long a = 0, b = 1, c;
		int i, limit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("limit: ");
		limit = input.nextInt();
		
		for(i=2; i <=limit; i++){
			c = a + b;
			b= c;
			a =b;
			System.out.printf("%d  ", c);
		}
		
		input.close();
	}

}
