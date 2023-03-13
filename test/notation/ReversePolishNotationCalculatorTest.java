package notation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    private static ReversePolishNotationCalculator calculator;

    @BeforeAll
    public static void beforeAllTests() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(10, calculator.calculatePolishNotation("5 5 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals(3, calculator.calculatePolishNotation("5 2 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        Assertions.assertEquals(-10, calculator.calculatePolishNotation("5 -2 *"));
    }

    @Test
    public void shouldCalculateWithMultiSpace() {
        Assertions.assertEquals(10, calculator.calculatePolishNotation("5     2 *"));
    }
}