import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun `Input of 1 should return "1"`() {
        val result = fizzBuzz.go(1)
        assertEquals("1", result)
    }

    @Test
    fun `Input of 3 should return "fizz"`() {
        val result = fizzBuzz.go(3)
        assertEquals("fizz", result)
    }

    @Test
    fun `Input of 5 should return "buzz"`() {
        val result = fizzBuzz.go(5)
        assertEquals("buzz", result)
    }

    @Test
    fun `Input of 15 should return "fizzbuzz"`() {
        val result = fizzBuzz.go(15)
        assertEquals("fizzbuzz", result)
    }

    @Test
    fun `Input of 97 should return "97"`() {
        val result = fizzBuzz.go(97)
        assertEquals("97", result)
    }

    @Test
    fun `Input of 99 should return "fizz"`() {
        val result = fizzBuzz.go(99)
        assertEquals("fizz", result)
    }
}