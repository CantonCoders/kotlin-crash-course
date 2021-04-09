class FizzBuzz {

    fun go(number: Int): String {
        return when {
            number % 15 == 0 -> "fizzbuzz"
            number % 3 == 0 -> "fizz"
            number % 5 == 0 -> "buzz"
            else ->  "${number}"
        }
    }

}
