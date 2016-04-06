package average;

class Average{
	public int getAverage(int a, int b){
		return (a+b)/2;
	}
	
	public int getAverage(int a, int b, int c){
		return (a+b+c)/3;
	}
}

public class AverageTest {

	public static void main(String[] args) {
		Average a = new Average();
		System.out.println(a.getAverage(10, 20));
		System.out.println(a.getAverage(10, 20,15));
	}

}
