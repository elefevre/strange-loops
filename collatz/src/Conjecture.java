public class Conjecture {
	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			System.out.println(stepsTo1(0, i));
		}
	}

	public static int stepsTo1(int steps, int value) {
		if (value == 1)
			return steps;

		boolean even = value % 2 == 0;
		if (even) {
			return stepsTo1(steps + 1, value / 2);
		}
		return stepsTo1(steps + 1, (value * 3 + 1));
	}

}
