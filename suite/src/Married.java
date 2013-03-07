public class Married {

	public static void main(String[] args) {
		Married married = new Married();
		for (int i = 0; i < 50; i++) {
			System.out.print(married.f(i) + " ");
		}
		System.out.println();
		for (int i = 0; i < 50; i++) {
			System.out.print(married.m(i) + " ");
		}
	}

	public int f(int n) {
		if (n == 0)
			return 1;

		return n - m(f(n - 1));
	}

	public int m(int n) {
		if (n == 0)
			return 0;

		return n - f(m(n - 1));
	}
}
