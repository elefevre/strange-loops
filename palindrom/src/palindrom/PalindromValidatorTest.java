package palindrom;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static palindrom.PalindromValidator.isPalindrom;

import org.junit.Test;

public class PalindromValidatorTest {
	@Test
	public void can_check_whether_a_string_is_a_palindrom() {
		assertThat(isPalindrom(""), is(true));
		assertThat(isPalindrom("a"), is(true));
		assertThat(isPalindrom("ab"), is(false));
		assertThat(isPalindrom("aa"), is(true));
		assertThat(isPalindrom("aab"), is(false));
		assertThat(isPalindrom("aba"), is(true));
		assertThat(isPalindrom("aabb"), is(false));
		assertThat(isPalindrom("aaba"), is(false));
	}
}
