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
        return Frame(rolls[frameIndex*2], rolls[frameIndex*2+1])
    }
}

class Frame(private val roll1: Int, private val roll2: Int) {

    fun getScore(): String {
        return (roll1 + roll2).toString();
    }
}