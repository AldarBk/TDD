import org.junit.Test
import kotlin.test.assertEquals

class newTddTest {
    @Test
    fun testMin() {
        val number = newTdd.Base(first = 5, second = 10)
        val actual: Int = number.minimum()
        val expected = 5
        assertEquals(expected, actual)
    }

    @Test
    fun testMax() {
        val number = newTdd.Base(first = -100, second = 65)
        val actual: Int = number.maximum()
        val expected = 65
        assertEquals(expected, actual)
    }

    @Test
    fun testList() {
        val number = newTdd.List(list = listOf(5, 3, 1, -10, 98))
        val minimum: Int = number.minimum()
        val maximum: Int = number.maximum()
        assertEquals(-10, minimum)
        assertEquals(98, maximum)
    }


    @Test
    fun testListEmpty() {
        val number = newTdd.List(list = listOf())
        val minimum: Int = number.minimum()
        val maximum: Int = number.maximum()
        assertEquals(Int.MIN_VALUE, minimum)
        assertEquals(Int.MAX_VALUE, maximum)
    }
}
