import java.util.Random;

// from http://stackoverflow.com/questions/15182496/why-does-this-code-print-hello-world
public class RandomHelloWorld {
	public static void main(String[] args) {
		System.out.println(randomString(-229985452) + " "
				+ randomString(-147909649));
	}

	public static String randomString(int i) {
		Random ran = new Random(i);
		StringBuilder sb = new StringBuilder();
		for (int n = 0;; n++) {
			int k = ran.nextInt(27);
			if (k == 0)
				break;

			sb.append((char) ('`' + k));
		}

		return sb.toString();
	}

}
