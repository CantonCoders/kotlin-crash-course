class FizzBuzz {

    fun go(number: Int): String {
        var result = ""

        if (number % 3 == 0) result += "fizz"
        if (number % 5 == 0) result += "buzz"

        if (result == "") return "${number}"

        return result
    }

}
