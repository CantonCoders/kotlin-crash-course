import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BowlingTest {

    private var bowlingGame = BowlingGame()
    @Test
    fun `Setup inital score bowling game`() {
        var score = bowlingGame.getScore()

        assertEquals("", score)
    }

    @Test
    fun `Player knocks down one pin`() {
        bowlingGame.pinsKnockedDown(1)
        var score = bowlingGame.getScore()

        assertEquals("1", score)
    }

    @Test
    fun `Player knocks down two pins`(){
        bowlingGame.pinsKnockedDown(2)
        var score = bowlingGame.getScore()

        assertEquals("2", score)
    }
    @Test
    fun `Player on second roll knocks down 2 pins over 2 rolls`(){
        bowlingGame.pinsKnockedDown(1)
        bowlingGame.pinsKnockedDown(1)

        var score = bowlingGame.getScore()

        assertEquals("11", score)
    }
    @Test
    fun `Player rolls a strike`(){
        bowlingGame.pinsKnockedDown(10)

        var score = bowlingGame.getScore()

        assertEquals("X", score)
    }
    @Test
    fun `Player rolls a spare`(){
        bowlingGame.pinsKnockedDown(7)
        bowlingGame.pinsKnockedDown(3)

        var score = bowlingGame.getScore()

        assertEquals("7/", score)
    }

    @Test
    fun `Score the first frame`() {
        bowlingGame.pinsKnockedDown(1)
        bowlingGame.pinsKnockedDown(3)

        assertEquals("4", bowlingGame.getFrame(0).getScore())
    }

    @Test
    fun `Score the second frame`() {
        bowlingGame.pinsKnockedDown(1)
        bowlingGame.pinsKnockedDown(3)
        bowlingGame.pinsKnockedDown(1)
        bowlingGame.pinsKnockedDown(2)

        assertEquals("3", bowlingGame.getFrame(1).getScore())

    }
}