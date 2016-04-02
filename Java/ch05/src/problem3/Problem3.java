package problem3;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int height;
		double inch;
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		height = input.nextInt();
		
		inch = height/2.54;
		
		System.out.printf("%dcm는 %d피트 %f인치입니다.", height, (int)inch/12, inch%12 );
		
		input.close();
	}

}
