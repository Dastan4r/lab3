import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.assertEquals

class `Lab3task2-3var16` {
    @Test
    fun var16z2() {
        assertFalse(var16z2(-2.0, 2.0))
        assertTrue(var16z2(-1.0, -1.0))
    }

    @Test
    fun var16z3() {
        assertEquals(1.0, var16z3(-1.0))
        assertEquals(-2.0, var16z3(4.0))
        assertEquals(-2.0, var16z3(9.0))
    }
}