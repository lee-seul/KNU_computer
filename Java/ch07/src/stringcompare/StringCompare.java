package stringcompare;
import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		String secondId ,firstId = "lee";
		Scanner input = new Scanner(System.in);
		
		System.out.print("ID입력: ");
		secondId = input.next();
		if(firstId.equals(secondId)){
			System.out.println("같음");
		}
		else
			System.out.println("다름");
		
		input.close();
	}

}
