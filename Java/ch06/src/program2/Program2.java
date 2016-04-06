package program2;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		char c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("알파벳 입력: ");
		c = input.next().charAt(0);
		
		switch (c){
		case 'a': case 'e': case 'o': case 'i': case 'u': case 'y':
			System.out.println("모음");
			break;
		default:
			System.out.println("자음");
			break;
		}
		input.close();
	}

}
