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
				+ "if (out.lastIndexOf('$') - out.indexOf('$') > 4) System.exit(0);"
				+ "System.out.println(paroles[0]);"
				+ "PrintWriter pw = new PrintWriter(out + `.java`); "
				+ "pw.format(text, 34, out, text); "
				+ "pw.close(); Runtime runtime = Runtime.getRuntime(); "
				+ "runtime.exec(`javac ` + out + `.java`).waitFor(); "
				+ "		Process java = runtime.exec(`java ` + out);" + 
				"		BufferedReader stdInput = new BufferedReader(new InputStreamReader(" + 
				"				java.getInputStream()));" + 
				"		String s;" +
				"		int index = 0;" + 
				"		while ((s = stdInput.readLine()) != null) {" + 
				"			index++;" + 
				"			if (paroles.length > index) System.out.println(paroles[index]);" + 
				"			System.out.println('\\t' + s);" + 
				"		}" + 
				"		while (paroles.length > index) {" + 
				"			index++;" + 
				"			System.out.println(paroles[index]);" + 
				"		}" + 
				"} " +
				"}")
				.replace("`", "%1$c").replace("[OUT]", "%2$s")
				.replace("[TEXT]", "%3$s");
		if (out.lastIndexOf('$') - out.indexOf('$') > 4) System.exit(0);
		System.out.println(paroles[0]);
		PrintWriter pw = new PrintWriter(out + ".java");
		pw.format(text, 34, out, text);
		pw.close();
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("javac " + out + ".java").waitFor();
		Process java = runtime.exec("java " + out);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(java.getInputStream()));
		String s;
		int index = 0;
		while ((s = stdInput.readLine()) != null) {
			index++;
			if (paroles.length > index) System.out.println(paroles[index]);
			System.out.println('\t' + s);
		}
		while (paroles.length > index) {
			index++;
			System.out.println(paroles[index]);
		}
	}
}