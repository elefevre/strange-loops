public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 0; i < 20; i++) {
			System.out.print(" " + fibonacci.fib(i));
		}
	}

	public int fib(int n) {
		if (n == 0 || n == 1)
			return n;

		return fib(n - 2) + fib(n - 1);
	}
}
