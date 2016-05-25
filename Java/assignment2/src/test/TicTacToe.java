package test;

import java.util.Scanner;


public class TicTacToe {

	public static void main(String[] args) {
		char[][] board = new char[4][4];
		int x, y;
		int i = 0, j = 0;
		boolean notFound = true;
		Scanner scan = new Scanner(System.in);
		
		for (i = 0; i < 4; i++)
			for (j = 0; j <4; j++)
				board[i][j] = ' ';
		
		do{
			for (i = 0; i < 4; i++){
				System.out.println(" " + board[i][0] + "| " + board[i][1] + "| " +
						board[i][2] + "| " + board[i][3]);
				
				if(i!=3)
					System.out.println("--|--|--|---");
			}
			System.out.print("다음 수의 좌표를 입력하시오:");
			x = scan.nextInt();
			y = scan.nextInt();
			
			if (x>=0 && x <4 && y>=0 && y < 4){
				if (board[x][y]!= ' '){
					System.out.println("잘못된 위치입니다. ");
					continue;
				}else
					board[x][y] = 'X';
			
				// 컴퓨터 입력 
				// 행을 검사한 이후, 행에 'X'가 없는 경우 행에 입력
				// 행에 'X'가 있을 경우 그 다음 행 검사
				for(i = 0; i < 4; i++){
					for (j = 0; j < 4; j++){
						if(board[i][j] == 'X'){
							break;
						}
					}
					
					if(j==4){
						for (j = 0; j < 4; j++){
							if(board[i][j]!='o'){
								board[i][j] = 'o';
								break;
							}
							else
								continue;
						}
						break;
					}
					
					
				}
				
			}
			else
				System.out.println("잘못된 위치입니다. ");
			
			int count = 0;
			int countO =0, countX=0;
			
			for(i = 0; i < 4; i++){
				// 가로 확인
				countO = 0;
				countX = 0;
				for (j = 0; j < 4; j++){
					if(board[i][j] == 'o')
						countO++;
					else if(board[i][j] == 'X')
						countX++;
				}
				if(countO==4){
					System.out.println("컴퓨터 승리");
					notFound = false;
					break;
				}
				else if(countX==4){
					System.out.println("사용자 승리");
					notFound = false;
					break;
				}
				//세로 확인
				countO = 0;
				countX = 0;
				for (j = 0; j < 4; j++){
					if(board[j][i] == 'o')
						countO++;
					else if(board[j][i] == 'X')
						countX++;
				}
				if(countO==4){
					System.out.println("컴퓨터 승리");
					notFound = false;
					break;
				}
				else if(countX==4){
					System.out.println("사용자 승리");
					notFound = false;
					break;
				}
			
			}
			
			//대각선 확인 
			countO = 0;
			countX = 0;
			for(i=0; i < 4; i++){
				if(board[i][i] == 'o')
					countO++;
				else if(board[i][i] == 'X')
					countX++;
			}
			
			if(countO==4){
				System.out.println("컴퓨터 승리");
				notFound = false;
				break;
			}
			else if(countX==4){
				System.out.println("사용자 승리");
				notFound = false;
				break;
			}
			
			
			// 대각선 반대 확인
			countO = 0;
			countX = 0;
			for(i=3; i >= 0; i--){
				if(board[i][i] == 'o')
					countO++;
				else if(board[i][i] == 'X')
					countX++;
			}
			
			if(countO==4){
				System.out.println("컴퓨터 승리");
				notFound = false;
				break;
			}
			else if(countX==4){
				System.out.println("사용자 승리");
				notFound = false;
				break;
			}
			
			// 무승부
			for(i = 0; i < 4; i++){
				for (j = 0; j < 4; j++){
					if(board[i][j] == 'o' || board[i][j] == 'X')
						count++;
				}
			}
			if (count==16){
				System.out.println("무승부");
				notFound = false;
				break;
			}
			
		}while(notFound);
	}

}
