import org.junit.Test
import kotlin.test.assertEquals

internal class numbersTest{

    @Test
    fun test_sum(){
        val number: Numbers = Numbers.Base(12,4)
        val actual = number.sum()
        val expected = 16
        assertEquals(expected,actual)
    }

    @Test
    fun test_dif(){
        val number: Numbers = Numbers.Base(12,4)
        val actual = number.dif()
        val expected = 8
        assertEquals(expected,actual)

    }

}