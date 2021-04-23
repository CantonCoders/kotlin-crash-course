import kotlin.math.abs

class TennisGame {

    private var playerTwoPoints: Int = 0
    private var playerOnePoints: Int = 0

    fun callScore(): String {
        return when {
            scoreIsTied() -> reportTiedScore()
            eitherPlayerHasAdvantage() -> reportAdvantage()
            gameOver() -> reportGameOver()
            else -> reportScore()
        }
    }

    private fun reportAdvantage() = "Advantage ${winningPlayerName()}"

    private fun reportScore(): String {
        return "${score(playerOnePoints)}, ${score(playerTwoPoints)}"
    }

    private fun reportGameOver(): String {
        return "Game ${winningPlayerName()}"
    }

    private fun winningPlayerName(): String {
        return if (playerOnePoints > playerTwoPoints) "Player 1" else "Player 2"
    }

    private fun gameOver() = (playerOnePoints > 3 || playerTwoPoints > 3)

    private fun eitherPlayerHasAdvantage() = (playerOnePoints >= 3 && playerTwoPoints >= 3) && abs(playerOnePoints - playerTwoPoints) == 1

    private fun reportTiedScore(): String {
        if (threePointsScored()) return "Deuce"
        return "${score(playerOnePoints)} All"
    }

    private fun threePointsScored() = playerOnePoints >= 3

    private fun scoreIsTied() = playerOnePoints == playerTwoPoints

    private fun score(points: Int): String {
        return when (points) {
            1 -> "Fifteen"
            2 -> "Thirty"
            3 -> "Forty"
            else -> "Love"
        }
    }

    fun playerOneScoresPoint() {
        playerOnePoints++
    }

    fun playerTwoScoresPoint() {
        playerTwoPoints++
    }

}
