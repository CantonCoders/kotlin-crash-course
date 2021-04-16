class FizzBuzz {

    fun go(number: Int): String {
        return when {
            checkForFizzBuzz(number) -> "fizzbuzz"
            checkForFizz(number) -> "fizz"
            checkForBuzz(number) -> "buzz"
            else ->  "$number"
        }
    }

    private fun checkForFizzBuzz(number: Int): Boolean {
        return checkForFizz(number) && checkForBuzz(number)
    }

    private fun checkForBuzz(number: Int): Boolean {
        return number % 5 == 0 || "$number".contains("5")
    }

    private fun checkForFizz(number: Int): Boolean {
        return number % 3 == 0 || "$number".contains("3")
    }

}
