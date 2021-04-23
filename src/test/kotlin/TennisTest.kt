import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TennisTest {

    private var game: TennisGame = TennisGame()

//    @BeforeEach
//    fun beforeAll() {
//        game = TennisGame()
//    }

    @Test
    fun `Game starts at Love All`() {
        var score = game.callScore()
        assertEquals("Love All", score)
    }

    @Test
    fun `Player 1 scores first point giving Fifteen, Love`() {
        game.playerOneScoresPoint()
        var score = game.callScore()
        assertEquals("Fifteen, Love", score)
    }

    @Test
    fun `Player 1 scores second point giving Thirty, Love`() {
        game.playerOneScoresPoint()
        game.playerOneScoresPoint()
        var score = game.callScore()
        assertEquals("Thirty, Love", score)
    }

    @Test
    fun `Player 1 scores third point giving Forty, Love`() {
        game.playerOneScoresPoint()
        game.playerOneScoresPoint()
        game.playerOneScoresPoint()
        var score = game.callScore()
        assertEquals("Forty, Love", score)
    }

    @Test
    fun `Player 1 scores winning point giving Game All Win`() {
        game.playerOneScoresPoint()
        game.playerOneScoresPoint()
        game.playerOneScoresPoint()
        game.playerOneScoresPoint()

        assertEquals("Game Player 1", game.callScore())
    }

    @Test
    fun `Player 2 scores first point give Love, Fifteen`() {
        game.playerTwoScoresPoint()

        assertEquals("Love, Fifteen", game.callScore())
    }

    @Test
    fun `Player 2 scores second point give Love, Thirty`() {
        game.playerTwoScoresPoint()
        game.playerTwoScoresPoint()

        assertEquals("Love, Thirty", game.callScore())
    }

    @Test
    fun `Players tied at Fifteen All`() {
        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        assertEquals("Fifteen All", game.callScore())
    }

    @Test
    fun `Players tied at Deuce`() {
        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()
        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()
        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        assertEquals("Deuce", game.callScore())
    }

    @Test
    fun `Player two beats the pants off Joel`() {
        game.playerTwoScoresPoint()
        game.playerTwoScoresPoint()
        game.playerTwoScoresPoint()
        game.playerTwoScoresPoint()

        assertEquals("Game Player 2", game.callScore())
    }

    @Test
    fun `Player One has Advantage`() {
        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        game.playerOneScoresPoint()

        assertEquals("Advantage Player 1", game.callScore())
    }

    @Test
    fun `Player Two has Advantage`() {
        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        game.playerOneScoresPoint()
        game.playerTwoScoresPoint()

        game.playerTwoScoresPoint()

        assertEquals("Advantage Player 2", game.callScore())
    }
}