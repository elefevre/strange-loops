public class FinallyContinue {
	public static void main(String... args) {
		while (true) {
			try {
				System.out.println("Devoxx");
				break;
			} finally {
				continue;
			}
		}
	}
}
