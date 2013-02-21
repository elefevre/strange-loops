public class H {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.print(h(i) + " ");
		}
	}

	static int h(int n) {
		if (n == 0)
			return 0;
		return n - h(h(h(n - 1)));
	}
}
