package uraryoperator;

public class UraryOperator {
	public static void main(String[] args) {
		int x = 1, y = 1;
		System.out.printf("%d, %d\n", x, y);
		int nextx = ++x;
		int nexty = y++;
		System.out.printf("%d, %d\n", x, y);
		System.out.printf("%d, %d\n", nextx, nexty);

	}

}
