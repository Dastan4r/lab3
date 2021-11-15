import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.assertEquals

class `Lab3task2-3var1` {
    @Test
    fun var1z2test() {
        assertTrue(var1z2(-1.0, -1.0))
        assertFalse(var1z2(-2.0, -3.0))
        assertFalse(var1z2(1.0, 1.0))
        assertFalse(var1z2(2.0, 5.0))
        assertTrue(var1z2(4.0, 3.0))
    }

    @Test
    fun var1z3test() {
        assertEquals(1.0, var1z3(-1.0))
        assertEquals(-4.0, var1z3(2.0))
        assertEquals(0.0, var1z3(0.0))
        assertEquals(-9.0, var1z3(3.0))
    }
}