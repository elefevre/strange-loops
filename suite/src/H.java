public class H {
	public static void main(String[] args) {
		H h = new H();
		for (int i = 0; i < 50; i++) {
			System.out.print(h.h(i) + " ");
		}
	}

	public int h(int n) {
		if (n == 0)
			return 0;

		return n - h(h(h(n - 1)));
	}
}
