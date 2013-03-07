class Q {
	public static void main(String[] a) {
		String t = "class Q { public static void main(String[] a) { String t = %c%s%c; System.out.printf(t, 34, t, 34); } }";
		System.out.printf(t, 34, t, 34);
	}
}