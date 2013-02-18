import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

public class Me {
	@Test
	public void this_is_not_it() {
		assertThat(this, is(not(this)));
	}

	// I don't like this new test much. I feel there is a way to make it better.
	// But how?
	@Test
	public void this_is_not_a_class() {
		assertThat(this, is(not(anObject())));
	}

	private static Matcher<Me> anObject() {
		return new BaseMatcher<Me>() {
			@Override
			public void describeTo(Description description) {
			}

			@Override
			public boolean matches(Object item) {
				return !(item instanceof Object);
			}
		};
	}

	public boolean equals(Object obj) {
		return false;
	};
}
