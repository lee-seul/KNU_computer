package problem6;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		int coin500, coin100, coin50, coin10;
		Scanner input = new Scanner(System.in);
		
		System.out.print("500원 동전 갯수: ");
		coin500 = input.nextInt();
		System.out.print("100원 동전 갯수: ");
		coin100 = input.nextInt();
		System.out.print("50원 동전 갯수: ");
		coin50 = input.nextInt();
		System.out.print("10원 동전 갯수: ");
		coin10 = input.nextInt();
		
		System.out.printf("액수: %d\n", coin500*500+coin100*100+coin50*50+coin10*10);
		
		input.close();
		
	}

}
