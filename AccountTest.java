import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccount() {
		Account account1 = new Account("abc", "123");
		assertEquals(account1.getName(), "abc");
		assertEquals(account1.getPassword(), "123");
		assertFalse(account1.getName().equals("xyz"));
		assertFalse(account1.getPassword().equals("233"));
		
		Account account2 = new Account("xyz" , "233");
		Account account3 = new Account("xyz" , "233");
		assertTrue(account2.equals(account3));
		assertFalse(account1.equals(account2));
	}

}
