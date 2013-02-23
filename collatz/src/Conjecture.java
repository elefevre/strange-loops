public class Conjecture {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(i + " required " + compute(i, 0) + " steps");
		}
	}

	private static int compute(int currentValue, int step) {
		if (currentValue == 1) {
			return step;
		}

		boolean even = currentValue % 2 == 0;
		int newValue = even ? (currentValue / 2) : (currentValue * 3 + 1);

		return compute(newValue, step + 1);
	}

}
