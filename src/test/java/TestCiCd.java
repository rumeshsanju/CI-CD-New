import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCiCd {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(5, 3), 5);
    }

    @Test
    public void testSubtract(){Calculator calc = new Calculator();
        assertEquals(calc.subtract(5, 2), 3);
    }

    @Test
    public void testMultiply(){
        Calculator calc = new Calculator();
        assertEquals(calc.multiply(6, 5), 30);
    }

    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        assertEquals(calc.divide(6, 2), 3);
    }


    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }
}
