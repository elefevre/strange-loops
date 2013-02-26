// from Java Puzzlers

public class FinallyDoNotContinue {
	public static void main(String... args) {
		while (true) {
			try {
				System.out.println("Devoxx");
				System.exit(0);
			} finally {
				continue;
			}
		}
	}
}
