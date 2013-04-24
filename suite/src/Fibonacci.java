public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 0; i < 20; i++) {
			System.out.print(" " + fibonacci.fib(i));
		}
	}

	public int fib(int rank) {
		if (rank == 0 || rank == 1)
			return rank;

		return fib(rank - 2) + fib(rank - 1);
	}
}
