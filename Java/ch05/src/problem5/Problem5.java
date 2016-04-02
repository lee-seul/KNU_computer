package problem5;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		byte height, length, size;
		Scanner input = new Scanner(System.in);
		
		System.out.print("너비: ");
		size = input.nextByte();
		
		System.out.print("길이: ");
		length = input.nextByte();

		System.out.print("높이: ");
		height = input.nextByte();
		
		System.out.printf("체적: %d\n", height*size*length);
		
		input.close();

	}

}
