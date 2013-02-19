public class ForLoopCurrentTimeMillis {
	public static void main(String... args) {
		System.out.println(System.currentTimeMillis());
		for (long t = 0; t < System.currentTimeMillis(); ++t) {
		}
		System.out.println(System.currentTimeMillis());
	}
}
