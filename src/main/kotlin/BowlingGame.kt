class BowlingGame {

    private var scoreCard:String = ""
    private var firstBall:Int = -1

    fun getScore(): String {
        return scoreCard
    }

    fun pinsKnockedDown(i: Int) {
        if(firstBall==-1)
        {
            scoreCard += i.toString()

            if(i==10)
                scoreCard = "X"
            firstBall = i
        }

        else if(i+firstBall==10)
            scoreCard +="/"
        else
            scoreCard += i.toString()

    }
}
