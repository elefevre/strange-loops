public class FinallyContinue {
	public static void main(String... args) {
		while (true) {
			try {
				return;
			} finally {
				continue;
			}
		}
	}
}
