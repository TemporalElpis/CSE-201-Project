import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void test() {
		Game game = new Game();
		Game game2 = new Game("a","b","c","d","e","f");
		game.setName("Kirby's Epic Yarn");
		game.setDeveloper("HAL Labratory");
		game.setPlatform("Wii");
		game.setGenre("Platform");
		game.setPrice("49.99");
		game.setRating("E");
		
		assertEquals(game.getName(), "Kirby's Epic Yarn");
		assertFalse(game.getName().equals("Fire Emblem: Awakening"));
		
		assertEquals(game.getDeveloper(), "HAL Labratory");
		assertFalse(game.getDeveloper().equals("Blizzard"));
		
		assertEquals(game.getRating(), "E");
		assertFalse(game.getRating().equals("M"));
		
		assertEquals(game2.getName(), "a");
		assertFalse(game2.getName().equals("Fire Emblem: Awakening"));
		
		assertEquals(game2.getDeveloper(), "c");
		assertFalse(game2.getName().equals("Fire Emblem: Awakening"));
	}

}
