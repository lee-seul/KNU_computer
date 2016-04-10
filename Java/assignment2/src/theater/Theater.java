package theater;
import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
		final int row = 5;
		final int col = 10;
		int num;
		int[][] seats = new int[row][col];
		Scanner scan = new Scanner(System.in);
		
		while(true){
			num = 1;
			for(int i = 0; i < row; i++){
				for(int j = 0; j < col; j++){
					System.out.printf("%2d  ", num);
					num++;
				}
				System.out.println();
			}
			for(int i = 0; i < row; i++){
				for(int j = 0; j < col; j++){
					System.out.printf("%2d  ", seats[i][j]);
				}
				System.out.println();
			}
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			int s = scan.nextInt();
			if (s == -1)
				break;
			if (seats[(s-1)/10][(s-1)%10] == 0){
				seats[(s-1)/10][(s-1)%10] = 1;
				System.out.println("예약되었습니다.");
			}
			else{
				System.out.println("이미 예약된 자리입니다.");
			}
		}
	}

}
