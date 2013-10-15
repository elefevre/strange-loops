public class Conjecture {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "->" + stepsTo1(i) + ", ");
		}
	}

	public static int stepsTo1(int value) {
		if (value == 1)
			return 0;

		boolean even = value % 2 == 0;
		if (even) {
			return 1 + stepsTo1(value / 2);
		}
		return 1 + stepsTo1(value * 3 + 1);
	}

}
