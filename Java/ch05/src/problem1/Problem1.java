package problem1;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("이름: ");
		name = input.next();
		System.out.print("나이: ");
		age = input.nextInt();
		
		System.out.println("이름은 " + name + "이고 나이는 " +age +"입니다." );
		
		
		input.close();
	}

}
