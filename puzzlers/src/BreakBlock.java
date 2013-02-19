public class BreakBlock {
	public static void main(String... args) {
		foo: {
			System.out.print("Hello, ");
			if (0 < System.currentTimeMillis())
				break foo;
			System.out.println("World!");
			System.exit(0);
		}

		System.out.println("Universe!");
	}
}
