public class G {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.print(g(i) + " ");
		}
	}

	static int g(int n) {
		if (n == 0)
			return 0;
		return n - g(g(n - 1));
	}
}
