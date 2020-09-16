package test.java.bowlingGame;

import junit.framework.TestCase;
import main.java.bowlingGame.Game;

public class BowlingGameTest extends TestCase {

    private Game game;

    protected void setUp() throws Exception {
        game = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            game.roll(pins);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10);
    }

    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    public void testOneSpare() throws Exception {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }

    public void testOneStrike() throws Exception {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertEquals(24, game.score());
    }

    public void testPerfectGame() throws Exception {
        rollMany(12, 10);
        assertEquals(300, game.score());
    }

}