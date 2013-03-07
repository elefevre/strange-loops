public class G {
	public static void main(String[] args) {
		G g = new G();
		for (int i = 0; i < 50; i++) {
			System.out.print(g.g(i) + " ");
		}
	}

	public int g(int n) {
		if (n == 0)
			return 0;

		return n - g(g(n - 1));
	}
}
