import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun sampleTest() {
        val fizzBuzz = FizzBuzz()
        val result = fizzBuzz.go(1)
        assertEquals("1", result)
    }

    @Test
    fun `should be divisable by three`() {
        val fizzBuzz = FizzBuzz()
        
    }
}