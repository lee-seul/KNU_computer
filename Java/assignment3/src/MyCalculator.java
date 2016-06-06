 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
class DyadicOperation {
 
   private double operandX;
   private double operandY;
   private double resultZ;
   private char operator;
 
   private static final char SPACE = ' ';
 
   // 생성자
   public DyadicOperation() {
      init();
   }
 
   // 초기화
   public void init() {
      setOperandX(0);
      setOperandY(0);
      setOperator(SPACE);
      setResultZ(0);
   }
 
   // 접근자
 
   public double getOperandX() {
      return operandX;
   }
 
   public double getOperandY() {
      return operandY;
   }
 
   public char getOperator() {
      return operator;
   }
 
   public double getResultZ() {
      return resultZ;
   }
 
   // 설정자
   public void setOperandX(double operandX) {
      this.operandX = operandX;
   }
 
   public void setOperandY(double operandY) {
      this.operandY = operandY;
   }
 
   public void setOperator(char operator) {
      this.operator = operator;
   }
 
   public void setResultZ(double resultZ) {
      this.resultZ = resultZ;
   }
 
   // 식 입력(피연산자 일때)
   public void inputFomula(double operand) {
      if (operator == SPACE) {
         setOperandX(operand);
      } else {
         setOperandY(operand);
      }
   }
 
   // 식 입력(연산자 일때)
   public boolean inputFomula(char operator) {
      if (operator == '+' || operator == '-' || operator == '*'
            || operator == '/') {
         if (getOperator() != SPACE) {
            calculate();
            setOperandX(resultZ);
            setOperandY(resultZ);
            setOperator(operator);
            return true;
         } else {
            setOperator(operator);
            return false;
         }
      } else if (operator == '=' && getOperator() != SPACE) {
         calculate();
         setOperandX(resultZ);
         return true;
      } else if (operator == '%' && getOperator() != SPACE) {
         setResultZ(getOperandX() * getOperandY() * 0.01);
         setOperandY(resultZ);
         return true;
      }
      return false;
   }
 
   // 연산
   public void calculate() {
      switch (getOperator()) {
      case '+':
         setResultZ(getOperandX() + getOperandY());
         break;
      case '-':
         setResultZ(getOperandX() - getOperandY());
         break;
      case '*':
         setResultZ(getOperandX() * getOperandY());
         break;
      case '/':
         setResultZ(getOperandX() / getOperandY());
         break;
      }
   }
}
 
class Real {
 
   private int integer;
   private String fraction;
   private boolean decimalPoint;
 
   // 생성자
   public Real() {
      init();
   }
 
   // 초기화
   public void init() {
      setInteger(0);
      setFraction("");
      setDecimalPoint(false);
   }
 
   // 부호 변경
   public void sign() {
      setInteger(getInteger() * -1);
   }
 
   // BackSpace 효과
   public void backSpace() {
      if (isDecimalPoint()) {
         if (getFraction().length() == 0) {
            setDecimalPoint(false);
            setInteger(getInteger() / 10);
         } else {
            setFraction(getFraction().substring(0,
                  getFraction().length() - 1));
         }
      } else {
         setInteger(getInteger() / 10);
      }
   }
 
   // 역수
   public void inverse() {
      double tmp = Double.parseDouble(toString());
      if (tmp != 0 && tmp != 1) {
         tmp = 1 / tmp;
         setReal(tmp);
      }
   }
 
   // 루트
   public void sqrt() {
      setReal(Math.sqrt(Double.parseDouble(toString())));
   }
 
   // 입력 받은 값을 실수에 연결
   public void inputAppend(char ch) {
      if (ch == '.') {
         setDecimalPoint(true);
      } else {
         if (isDecimalPoint()) {
            setFraction(getFraction() + ch);
         } else {
            setInteger(getInteger() * 10 + ch - '0');
         }
      }
   }
 
   // 현재 값을 반환
   public String toString() {
      return getInteger() + "." + getFraction();
   }
 
   // 접근자
   public int getInteger() {
      return integer;
   }
 
   public String getFraction() {
      return fraction;
   }
 
   public boolean isDecimalPoint() {
      return decimalPoint;
   }
 
   // 설정자
   public void setReal(double num) {
      setInteger((int) num);
      if (getInteger() == num) {
         setDecimalPoint(false);
         setFraction("");
      } else {
         setFraction(num - getInteger() + "");
         setFraction(getFraction().substring(2));
      }
   }
 
   public void setInteger(int integer) {
      this.integer = integer;
   }
 
   public void setDecimalPoint(boolean decimalPoint) {
      this.decimalPoint = decimalPoint;
   }
 
   public void setFraction(String fraction) {
      this.fraction = fraction;
   }
}
 
public class MyCalculator extends JFrame{
    private JTextField f;//텍스트 필드
    private boolean resultPrint;//결과 출력 상태
    private DyadicOperation operation;//이항 연산 클래스
    private Real num;//실수
 
    //생성자
    public MyCalculator(){
          //슈퍼 클래스 생성자 명시적 호출을 통한 프레임 제목 설정
          super("MyCalculator");
 
          f = new JTextField("0.");//텍스트 필드
          setResultPrint(false);//결과 출력 상태
          operation = new DyadicOperation();//이항 연산 클래스
          num = new Real();//실수
 
          //메인 패널로 사용할 패널을 생성
          JPanel mainPanel = new JPanel();
          //flow, border, grid 중 텍스트 필드와 키패널의 비대칭적 크기를 고려해 border 선택
          mainPanel.setLayout(new BorderLayout(10,10));
 
          //텍스트 필드 생성 및 추가
          f.setHorizontalAlignment(JTextField.RIGHT);
          f.setEditable(false);
          f.setBackground(Color.WHITE);
          mainPanel.add(f,BorderLayout.NORTH);
 
          //키패널 생성 및 추가
          JPanel mainKeyPanel = new JPanel();
          mainKeyPanel.setLayout(new BorderLayout(10,10));
          KeyPanel1 keyPanel1 = new KeyPanel1();
          KeyPanel2 keyPanel2 = new KeyPanel2();
          mainKeyPanel.add(keyPanel1,BorderLayout.NORTH);
          mainKeyPanel.add(keyPanel2,BorderLayout.CENTER);
          mainPanel.add(mainKeyPanel,BorderLayout.CENTER);
          
          //메인 패널을 프레임에 추가
          add(mainPanel);
 
          //flow, border, grid 중 프레임과 메인 패널 사이에 적절한 공간을 줄 수 있는 flow 선택
          setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          pack();
          setResizable(false);
          setVisible(true);
    }
    
    //키패널 클래스 1
    class KeyPanel1 extends JPanel{
          public KeyPanel1(){
                 //flow, border, grid 중 버튼 정렬을 하기 가장 적합한 grid 선택
                 setLayout(new GridLayout(0,3,10,10));
                 
                 String[] str = new String[]      {"Backspace", "CE", "C"};
                 JButton[] button = new JButton[str.length];
                 //Backspace, CE, C의 순서로 버튼이 추가 되도록 반복
                 for(int i=0; i<str.length; i++){
                        button[i] = new JButton(str[i]);
                        button[i].setBackground(Color.WHITE);
                        button[i].setForeground(Color.RED);
                        add(button[i]);
                        button[i].addActionListener(new MyActionListener1());
                 }
          }
    }
    
    //액션 리스너1 클래스
    class MyActionListener1 implements ActionListener{//내부 클래스
          @Override
          public void actionPerformed(ActionEvent e) {
                 if(e.getActionCommand()=="C"){//초기화
                        operation.init();
                        num.init();
                 }
                 else if(e.getActionCommand()=="CE"){//현재 입력한 값 초기화
                        num.init();
                 }
                 else{//BackSpace
                        num.backSpace();
                 }
                 f.setText(num.toString());
          }
    }
 
    //키패널 클래스 2
    class KeyPanel2 extends JPanel{//내부 클래스
          public KeyPanel2(){//생성자
                 //flow, border, grid 중 버튼 정렬을 하기 가장 적합한 grid 선택
                 setLayout(new GridLayout(0,5,10,10));
 
                 String[] str = new String[]
                              {"7", "8", "9", "/", "sqrt", "4", "5", "6", "*", "%",
                              "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="};
                 JButton[] button = new JButton[str.length];
                 //7, 8, 9, /, sqrt,4,5,6,*,%,1,2,3,-,
                 //1/x, 0, +/-, ., +, =의 순서로 버튼이 추가 되도록 반복
                 for(int i=0; i<str.length; i++){
                        button[i] = new JButton(str[i]);
                        add(button[i]);
                        button[i].setBackground(Color.WHITE);
                        button[i].addActionListener(new MyActionListener2());
                 }
                 button[3].setForeground(Color.RED);
                 button[8].setForeground(Color.RED);
                 button[13].setForeground(Color.RED);
                 button[18].setForeground(Color.RED);
                 button[19].setForeground(Color.RED);
          }
    }
 
    //액션 리스너2 클래스
    class MyActionListener2 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e) {//내부 클래스
                 // TODO Auto-generated method stub
                 String str = e.getActionCommand();
                 if(str.length() == 1){//단문자 인 경우
                        switch(str.charAt(0)){
                        //이항 연산자인 경우
                        case '/':
                        case '*':
                        case '-':
                        case '+':
                        case '=':
                        case '%':
                              if(num.toString() != "0."){
                                     operation.inputFomula(Double.parseDouble(num.toString()));
                              }
                              setResultPrint(operation.inputFomula(str.charAt(0)));
                              if(isResultPrint()){
                                     num.setReal(operation.getOperandX());
                                     f.setText(num.toString());
                              }
                              num.init();
                              break;
                        default:
                              num.inputAppend(str.charAt(0));
                              f.setText(num.toString());
                              break;
                        }
                 }
                 else{
                        if(str == "+/-"){
                              num.sign();
                        }
                        else if(str == "1/x"){
                              num.inverse();
                        }
                        else{
                              num.sqrt();
                        }
                        f.setText(num.toString());
                 }
          }
    }
    
    //접근자
    public boolean isResultPrint() {return resultPrint;}
    
    //설정자
    public void setResultPrint(boolean resultPrint) {this.resultPrint = resultPrint;}
 
 
 
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      MyCalculator c=new MyCalculator();
 
   }
 
}