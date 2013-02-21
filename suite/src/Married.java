public class Married {

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.print(f(i) + " ");
		}
		System.out.println();
		for (int i = 0; i < 50; i++) {
			System.out.print(m(i) + " ");
		}
	}

	static int f(int n) {
		if (n == 0)
			return 1;
		return n - m(f(n - 1));
	}

	static int m(int n) {
		if (n == 0)
			return 0;
		return n - f(m(n - 1));
	}
}
