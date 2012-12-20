package palindrom;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ClassPalindromValidatorTest {
	@Test
	public void can_check_whether_the_code_source_for_the_simplest_possible_class_is_a_palindrom()
			throws IOException {
		assertThat(reversed(read(A.class)), is(read(A.class)));
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
