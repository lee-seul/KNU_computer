package arraytest3;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner input = new Scanner(System.in);
		System.out.print("크기 입력: ");
		size = input.nextInt();
		int[] scores = new int[size];
		
		for(int i = 0; i <scores.length; i++){
			System.out.print("성적 입력");
			scores[i] = input.nextInt();
		}
		
		for(int i = 0; i <scores.length; i++){
			total += scores[i];
		}
		System.out.println(total/scores.length);
		
		input.close();
	}

}
