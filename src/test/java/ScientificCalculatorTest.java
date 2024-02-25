import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScientificCalculatorTest {

    private Main scientificCalculator;

    @Before
    public void initialise(){
        scientificCalculator = new Main();
    }

    @Test
    public void testSquareRoot() {
        double val = 64.0;
        double expectedResult = 8.0;
        double acutalResult = scientificCalculator.squareRoot(val);
        Assert.assertEquals(expectedResult, acutalResult, 0.0f);
    }

    @Test
    public void testFactorial() {
        int a = 4;
        int expectedResult = 24;
        int acutalResult = scientificCalculator.factorial(a);
        Assert.assertEquals(expectedResult, acutalResult);
    }

    @Test
    public void testNaturalLogarithm() {
        double a = 11;
        double expectedResult = 2.39;
        double acutalResult = scientificCalculator.naturalLogarithm(a);
        Assert.assertEquals(expectedResult, acutalResult, 0.2f);
    }

    @Test
    public void testPower() {
        double a = 2.0;
        double b = 10.0;
        double expectedResult = 1024.0;
        double acutalResult = scientificCalculator.power(a,b);
        Assert.assertEquals(expectedResult, acutalResult, 0.0f);
    }
}
