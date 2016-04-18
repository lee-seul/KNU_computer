import java.util.Scanner;

class DiceGame{

    int diceFace;
    int userGuess;

    private void RollDice(){
        
        diceFace = (int)(Math.random() * 6) + 1;
    }

    private int getUserInput(String prompt){
        
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);

        return s.nextInt();
    }

    private void checkUserGuess(){
    
        if(diceFace == userGuess)
            System.out.println("정답");
        else
            System.out.println("오답");

    }

    public void startPlaying(){
    
        userGuess = getUserInput("값 입력: ");
        RollDice();
        checkUserGuess();
    }

}

public class DiceGameTest{
    
    public static void main(String[] args){
        
        DiceGame game = new DiceGame();
        game.startPlaying();
    }
}
