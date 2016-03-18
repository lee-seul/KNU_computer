package gcb;
import java.util.Scanner;

public class Gcb {
	public int find_gcb(int a, int b){
		if(a%b==0)
			return b;
		else
			return find_gcb(b, a%b);	
	}
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("a:");
		a = input.nextInt();
		System.out.print("b:");
		b  = input.nextInt();
		
		Gcb gcb = new Gcb();
		
		System.out.printf("%d", gcb.find_gcb(a,b));
		
		input.close();
	}

}
