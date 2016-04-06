package problem2;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		int pay, price, change;
		Scanner input = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		pay = input.nextInt();
		System.out.print("상품의 총액: ");
		price = input.nextInt();
		System.out.println("부가세: " + price*0.1);
		change = pay - price;
		System.out.println("잔돈: " + change);
		
		input.close();
	}

}
