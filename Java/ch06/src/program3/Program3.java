package program3;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int height, weight;
		double standard;
		Scanner input = new Scanner(System.in);
		
		System.out.print("키: ");
		height = input.nextInt();

		System.out.print("몸무게: ");
		weight = input.nextInt();
		
		standard = (height-100) * 0.9;
		
		if(weight> standard*1.1){
			System.out.println("과체중");
		}
		else if(weight< standard*0.9){
			System.out.println("저체중");
		}
		else{
			System.out.println("표준 체중");
		}
		
		input.close();
		
	}

}
