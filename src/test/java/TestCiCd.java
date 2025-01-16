import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCiCd {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(5, 3), 12);
    }

    @Test
    public void testSubtract(){Calculator calc = new Calculator();
        assertEquals(calc.subtract(5, 2), 6);
    }

    @Test
    public void testMultiply(){
        Calculator calc = new Calculator();
        assertEquals(calc.multiply(6, 5), 30);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }
}
