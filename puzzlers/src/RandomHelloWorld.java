import java.util.Random;

// from http://stackoverflow.com/questions/15182496/why-does-this-code-print-hello-world
public class RandomHelloWorld {
	public static void main(String[] args) {
		System.out.println(randomString(-229985452) + " "
				+ randomString(-147909649));
	}

	public static String randomString(int seed) {
		Random ran = new Random(seed);
		String str = "";
		for (int i = 0; i < 5; i++) {
			int k = ran.nextInt(27);

			str += (char) (96 + k);
		}

		return str;
	}

}
