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
    public void test_addition(){
        double x = 4.5;
        double y = 6.5;
        double expectedResult = 11.0;

        double actualResult = scientificCalculator.addition(x,y);
        Assert.assertEquals(expectedResult, actualResult, 0.0f);
    }
}
