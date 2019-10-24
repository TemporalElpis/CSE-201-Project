import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccount() {
		Account account = new Account("abc", "123");
		assertEquals(account.getName(), "abc");
		assertEquals(account.getPassword(), "123");
	}

}
