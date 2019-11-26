import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GUIMockUpTest {

	@Test
	void testLoad() {
		GUIMockUp testcase = new GUIMockUp();
		assertTrue(testcase.games.get(0).getName().equals("Untitled Goose Game"));
		assertTrue(testcase.games.get(0).getGenre().equals("Puzzle"));
		assertTrue(testcase.games.get(1).getGenre().equals("RPG"));
		
		
		
	}

}
