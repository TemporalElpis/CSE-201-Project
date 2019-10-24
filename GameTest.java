import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void test() {
		Game game = new Game();
		game.setName("Kirby's Epic Yarn");
		game.setDeveloper("HAL Labratory");
		game.setPlatform("Wii");
		game.setGenre("Platform");
		game.setPrice(49.99);
		game.setRating("E");
		
		assertEquals(game.getName(), "Kirby's Epic Yarn");
		assertFalse(game.getName().equals("Fire Emblem: Awakening"));
		
		assertEquals(game.getDeveloper(), "HAL Labratory");
		assertFalse(game.getDeveloper().equals("Blizzard"));
		
		assertEquals(game.getRating(), "E");
		assertFalse(game.getRating().equals("M"));
	}

}
