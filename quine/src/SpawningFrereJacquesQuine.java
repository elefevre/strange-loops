import java.io.*;

public class SpawningFrereJacquesQuine {
	public static void main(String[] args) throws Exception {
		String[] paroles = { "Frere Jacques", "Frere Jacques", "Dormez-vous ?", "Dormez-vous ?", "Sonnez les matines", "Sonnez les matines", "Ding daing dong", "Ding daing dong" };
		char q = 34; String out = "SpawningFrereJacquesQuine$";
		String text = ("import java.io.*; "
				+ "public class [OUT] { "
				+ "public static void main(String[] args) throws Exception { "
				+ "String[] paroles = {`Frere Jacques`, `Frere Jacques`, `Dormez-vous ?`, `Dormez-vous ?`, `Sonnez les matines`, `Sonnez les matines`, `Ding daing dong`, `Ding daing dong`};"
				+ "char q = 34; String out = `[OUT]$`; String text = `[TEXT]`; "
				+ "int index = out.lastIndexOf('$') - out.indexOf('$') ;"
				+ "if (paroles.length > index) System.out.println(paroles[index]);"
				+ "else System.exit(0);"
				+ "PrintWriter pw = new PrintWriter(out + `.java`); "
				+ "pw.format(text, 34, out, text); "
				+ "pw.close(); Runtime runtime = Runtime.getRuntime(); "
				+ "runtime.exec(`javac ` + out + `.java`).waitFor(); "
				+ "		Process java = runtime.exec(`java ` + out);" + 
				"		BufferedReader stdInput = new BufferedReader(new InputStreamReader(" + 
				"				java.getInputStream()));" + 
				"		String s;" + 
				"		while ((s = stdInput.readLine()) != null) {" + 
				"			System.out.println(s);" + 
				"		}" + 
				"" +
				"} " +
				"}")
				.replace("`", "%1$c").replace("[OUT]", "%2$s")
				.replace("[TEXT]", "%3$s");
		int index = out.lastIndexOf('$') - out.indexOf('$');
		if (paroles.length > index)
			System.out.println(paroles[index]);
		else
			System.exit(0);
		PrintWriter pw = new PrintWriter(out + ".java");
		pw.format(text, 34, out, text);
		pw.close();
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("javac " + out + ".java").waitFor();
		Process java = runtime.exec("java " + out);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(
				java.getInputStream()));
		String s;
		while ((s = stdInput.readLine()) != null) {
			System.out.println(s);
		}
	}
}