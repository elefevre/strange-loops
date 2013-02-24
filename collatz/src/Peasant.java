public class Peasant {
	public static void main(String[] args) {
		System.out.println("1x1= " + compute(1, 1));
		System.out.println("1x2= " + compute(1, 2));
		System.out.println("2x3= " + compute(2, 3));
		System.out.println("5x7= " + compute(5, 7));
		System.out.println("4x4= " + compute(4, 4));
	}

	private static int compute(int a, int b) {
		if (b == 1) {
			return a;
		}

		boolean even = b % 2 == 0;
		if (even) {
			return compute(a << 1, b >> 1);
		}
		return a + compute(a, b - 1);
	}
}
