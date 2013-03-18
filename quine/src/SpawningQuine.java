import java.io.*;

public class SpawningQuine {
	public static void main(String[] args) throws Exception {
		String out = "SpawningQuine$";
		String text = "import java.io.*;" +
				" public class %2$s {" +
				" public static void main(String[] args) throws Exception {" +
				" String out = %1$c%2$s$%1$c;" +
				" String text = %1$c%3$s%1$c;" +
				" PrintWriter pw = new PrintWriter(out + %1$c.java%1$c);" +
				" pw.format(text, 34, out, text);" +
				" pw.close();" +
				" Runtime runtime = Runtime.getRuntime();" +
				" runtime.exec(%1$cjavac %1$c + out + %1$c.java%1$c).waitFor();" +
				" runtime.exec(%1$cjava %1$c + out);" +
				" }" +
				" }";
		PrintWriter pw = new PrintWriter(out + ".java");
		pw.format(text, 34, out, text);
		pw.close();
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("javac " + out + ".java").waitFor();
		runtime.exec("java " + out);
	}
}