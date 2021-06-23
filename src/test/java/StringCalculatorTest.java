import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    private StringCalculator calc;

    @BeforeEach
    public void setUp(){
        calc = new StringCalculator();
    }

    @AfterEach
    public void tearDown(){
        calc = null;
    }

    @Test
    public void testAddWhenNegative(){
        assertThrows(IllegalArgumentException.class, () -> calc.add("-1,5"));
    }

    @Test
    public void testAddWhen1000orGreater(){
        int result = calc.add("1,1000");
        assertEquals(1, result);
    }
}