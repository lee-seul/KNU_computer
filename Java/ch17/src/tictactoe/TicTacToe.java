package tictactoe;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe {
    private static String piece="O";
    protected static Boolean player=true;
    private static final JFrame frame = new JFrame("Tic Tac Toe");
    private static final JPanel panel=new JPanel(new GridLayout(4,3));
    protected static final JButton[] cells= new JButton[9];
    private static final JButton exitButton=new JButton("Exit");
    private static final JButton restartButton=new JButton("Restart");
    protected static final JLabel winLabel = new JLabel("클릭");

    public static void main(String[] args){
         createWindow();
         createButtons();
    }


    private static void createWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 600);
        frame.setVisible(true);
    }

   
    private static void createButtons(){
        for(int i=0; i<9; i++){
            cells[i]=new JButton();
            cells[i].addActionListener(new ButtonHandler());
            panel.add(cells[i]);
        }
        exitButton.addActionListener(new ExitHandler());
        restartButton.addActionListener(new RestartHandler());
        panel.add(exitButton);
        panel.add(restartButton);
        panel.add(winLabel);
        frame.add(panel);
        frame.setVisible(true);
        
    }

    protected static String getPiece(){
        return piece;
    }
    protected static void setPiece(String s){
        piece=s;
    }

    protected static Boolean checkWinner(){
        if(checkCells(cells[0], cells[4], cells[8])) return true;
        else if(checkCells(cells[2], cells[4], cells[6])) return true;

        else if(checkCells(cells[2], cells[5], cells[8])) return true;
        else if(checkCells(cells[1], cells[4], cells[7])) return true;
        else if(checkCells(cells[0], cells[3], cells[6])) return true;

        else if(checkCells(cells[0], cells[1], cells[2])) return true;
        else if(checkCells(cells[3], cells[4], cells[5])) return true;
        else if(checkCells(cells[6], cells[7], cells[8])) return true;
        else return false;
    }

    
    private static Boolean checkCells(JButton cell1, JButton cell2, JButton cell3){
        return(cell1.getText()==getPiece() &&
               cell2.getText()==getPiece() &&
               cell3.getText()==getPiece()
        );
    }
}

class ButtonHandler implements ActionListener{  
    public void actionPerformed(ActionEvent e){
        JButton pressedButton=(JButton)(e.getSource());
        pressedButton.setText(TicTacToe.getPiece());
        pressedButton.setEnabled(false);

        if(!TicTacToe.checkWinner()){
            TicTacToe.player=!TicTacToe.player;
            String changePiece=(TicTacToe.player)? "O":"X";
            TicTacToe.setPiece(changePiece);
            TicTacToe.winLabel.setText(TicTacToe.getPiece()+"유저 클릭하세요");
            return;
        }
        for(JButton c:TicTacToe.cells){
            c.setEnabled(false);
            TicTacToe.winLabel.setText("Game over! "+TicTacToe.getPiece()+" 승리!");
        }
        return;
    }
}

class ExitHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

class RestartHandler implements ActionListener{
    TicTacToe GUI = new TicTacToe();
    public void actionPerformed(ActionEvent e){
        for(JButton c:GUI.cells){
            c.setEnabled(true);
            c.setText("");
        }
    }
}
