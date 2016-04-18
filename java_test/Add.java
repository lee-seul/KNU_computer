import java.util.Scanner;

public class Add{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x, y, sum;
        
        System.out.print("숫자 입력");
        x = input.nextInt();

        System.out.print("숫자 입력");
        y = input.nextInt();

        sum = x + y;

        System.out.println(sum);
    }
}
