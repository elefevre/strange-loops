
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ClassPalindromValidatorTest {
	@Test
	public void can_check_whether_the_code_source_for_A_is_a_palindrom()
			throws IOException {
		// A is the simplest possible class palindrom
		assertThat(reversed(read(A.class)), is(read(A.class)));
	}

	@Test
	public void can_check_whether_the_code_source_for_tni_is_a_palindrom()
			throws IOException {
		// tni is a class palindrom that displays "Hello, World"
		// see http://stackoverflow.com/questions/659752/programming-challenge-can-you-code-a-hello-world-program-as-a-palindrome
		assertThat(reversed(read(tni.class)), is(read(tni.class)));
	}

	private String reversed(String str) {
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			string += str.charAt(str.length() - i - 1);
		}
		return string;
	}

	private String read(Class<?> klass) throws IOException {
		File classfile = new File("src/"
				+ klass.getCanonicalName().replaceAll("\\.", "/") + ".java");
		BufferedReader br = new BufferedReader(new FileReader(classfile));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				line = br.readLine();
				if (line != null) {
					sb.append("\n");
				}
			}
			return sb.toString();
		} finally {
			br.close();
		}
	}
}
