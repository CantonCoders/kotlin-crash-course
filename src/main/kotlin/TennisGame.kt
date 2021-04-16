class TennisGame {

    private var playerTwoPoints: Int = 0
    private var playerOnePoints: Int = 0

    fun callScore(): String {
        if (gameIsWinnable()) return winningScore()
        if (scoreIsTied()) return buildTiedScore()

        return buildScore()
    }

    private fun buildScore(): String {
        return "${score(playerOnePoints)}, ${score(playerTwoPoints)}"
    }

    private fun winningScore(): String {
        return "Game ${winningPlayerName()}"
    }

    private fun winningPlayerName(): String {
        return if (playerOnePoints > playerTwoPoints) "Player 1" else "Player 2"
    }

    private fun playerOneWins(): Boolean {
        return playerOnePoints - playerTwoPoints > 1
    }

    private fun gameIsWinnable() = playerOnePoints > 3 || playerTwoPoints > 3

    private fun buildTiedScore(): String {
        if (threePointsScored()) return "Deuce"
        return "${score(playerOnePoints)} All"
    }

    private fun threePointsScored() = playerOnePoints == 3

    private fun scoreIsTied() = playerOnePoints == playerTwoPoints

    private fun score(points: Int): String {
        return when {
            points == 1 -> "Fifteen"
            points == 2 -> "Thirty"
            points == 3 -> "Forty"
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
