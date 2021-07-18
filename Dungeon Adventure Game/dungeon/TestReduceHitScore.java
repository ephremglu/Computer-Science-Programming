package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReduceHitScore {

	@Test
	void testReduceHitScore() {
		Hero theHero = HeroFactory.addCharacter(1);
		int heroHitScoreInitial = theHero.getHitScore();
		theHero.reduceHitScore(10);
		if (heroHitScoreInitial != theHero.getHitScore()) {
			assertNotEquals(heroHitScoreInitial, theHero.getHitScore());
		} else {
			fail("Not yet implemented");
		}
	}
}