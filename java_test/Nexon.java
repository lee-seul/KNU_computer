import java.util.Scanner;


class Generator{

    public int generator(int num){
        String number = Integer.toString(num);
        int result = 0;
        int n;

        for(int i = 0; i < number.length(); i++){
        
            n = number.charAt(i);
            result += Character.getNumericValue(n);
        }
        
        return result + num;
    }
}


public class Nexon{

    public static void main(String[] args){
        
        Generator d = new Generator();
        Scanner input = new Scanner(System.in);
        

        System.out.print("숫자 입력: ");
        int value = input.nextInt();

        System.out.println(d.generator(value));
    }
}
