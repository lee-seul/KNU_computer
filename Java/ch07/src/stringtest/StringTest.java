package stringtest;
import java.util.Scanner;


public class StringTest {

	public static void main(String[] args) {
		String s = new String();
		int length;
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		s = input.next();
		length = s.length();
		
		for(int i=length-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
		input.close();
	}

}
