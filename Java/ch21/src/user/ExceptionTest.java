package user;

class MyException extends Exception {
	public MyException() {
		super("사용자 정의 예외");
	}
}

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException e) {
			System.err.println(e.getMessage() + "\n호출 스택 사용:");
			e.printStackTrace();
		}
	}
	
	public static void method1() throws MyException{
		throw new MyException();
	}

}
