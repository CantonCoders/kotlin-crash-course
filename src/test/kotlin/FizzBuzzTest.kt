import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `Input of 1 should return "1"`() {
        val fizzBuzz = FizzBuzz()
        val result = fizzBuzz.go(1)
        assertEquals("1", result)
    }

    @Test
    fun `Input of 3 should return "fizz"`() {
        val fizzBuzz = FizzBuzz()
        val result = fizzBuzz.go(3)
        assertEquals("fizz", result)
    }
}