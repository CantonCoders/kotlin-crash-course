class FizzBuzz {

    fun go(number: Int): String {
        return when {
            number % 15 == 0 -> "fizzbuzz"
            checkForFizz(number) -> "fizz"
            number % 5 == 0 -> "buzz"
            else ->  "${number}"
        }
    }

    private fun checkForFizz(number: Int): Boolean {
        return number % 3 == 0 || "${number}".contains("3")
    }

}
