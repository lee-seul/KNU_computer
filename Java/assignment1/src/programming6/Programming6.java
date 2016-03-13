package programming6;
import java.util.Scanner;

public class Programming6 {
	public static void main(String[] args) {
		int coin500, coin100, coin50, coin10, total;
		Scanner input = new Scanner(System.in);
		
		System.out.println("500원 동전 개수: ");
		coin500 = input.nextInt();
		System.out.println("100원 동전 개수: ");
		coin100 = input.nextInt();
		System.out.println("50원 동전 개수: ");
		coin50 = input.nextInt();
		System.out.println("10원 동전 개수: ");
		coin10 = input.nextInt();
		
		total = coin500 * 500 + coin100 * 100 + coin50 * 50 + coin10 * 10;
		System.out.printf("총 금액: %d원 \n", total);
		
		input.close();
	}
}
