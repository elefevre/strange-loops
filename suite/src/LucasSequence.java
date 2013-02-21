public class LucasSequence {
	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			System.out.print(q(i) + " ");
		}
	}

	static int q(int n) {
		if (n == 1 || n == 2)
			return 1;
		return q(n - q(n - 1)) + q(n - q(n - 2));
	}
}
