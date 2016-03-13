package problem;
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		double AC, AE, BC, DE;
		
		Scanner input = new Scanner(System.in);
		System.out.println("AC입력: ");
		AC = input.nextDouble();
		System.out.println("AE입력: ");
		AE = input.nextDouble();
		System.out.println("BC입력: ");
		BC = input.nextDouble();
		
		DE = (AC*AE)/BC;
		System.out.printf("%f*%f = %f*%f, DE = %f\n", AC, AE, BC, DE, DE);
		
		input.close();

	}

}
