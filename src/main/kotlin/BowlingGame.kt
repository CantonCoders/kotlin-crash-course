class BowlingGame {

    private var scoreCard:String = ""
    private var firstBall:Int = -1

    private val rolls = arrayListOf<Int>()

    fun getScore(): String {
        return scoreCard
    }

    fun pinsKnockedDown(i: Int) {

        rolls.add(i)

        if(firstBall == -1)
        {
            scoreCard += i.toString()

            if(i==10)
                scoreCard = "X"
            firstBall = i
        }

        else if(i+firstBall == 10)
            scoreCard +="/"
        else
            scoreCard += i.toString()

    }

    fun getFrame(frameIndex: Int): Frame {
        var rollIndex = 0
        var currentFrame = 0
        var score = 0

        do {
            score = calculateRunningScore(score, rollIndex)
            if (currentFrame == frameIndex) break;
            if (rolls[rollIndex] < 10) rollIndex += 2 else rollIndex++
            currentFrame++
        } while (rollIndex < rolls.size)

        return Frame(rolls[rollIndex], getSecondRoll(rollIndex), score)
    }

    private fun calculateRunningScore(currentScore: Int, rollIndex: Int): Int {
        var score = currentScore + rolls[rollIndex] + getSecondRoll(rollIndex)

        if (rolls[rollIndex] == 10)
            score += rolls[rollIndex+1] + rolls[rollIndex+2]

        return score
    }

    private fun getSecondRoll(rollIndex: Int) = if (rolls[rollIndex] < 10) rolls[rollIndex + 1] else 0
}

class Frame(private val roll1: Int, private val roll2: Int, private val score: Int) {

    fun getScore(): String {
        return score.toString();
    }
}