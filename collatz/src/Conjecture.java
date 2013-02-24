public class Conjecture {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(i + " required " + compute(0, i) + " steps");
		}
	}

	private static int compute(int a, int b) {
		if (b == 1) {
			return a;
		}

		boolean even = b % 2 == 0;
		if (even) {
			return compute(a + 1, b >> 1);
		}
		return compute(a + 1, (b * 3 + 1));
	}

}
