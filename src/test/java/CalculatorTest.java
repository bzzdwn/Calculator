import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void TestAdd1() throws Exception {
        Calculator calc = new Calculator();
        Assert.assertEquals(8, calc.add(1, 7), 0.00001);
    }
    @Test
    public void TestAdd2() throws Exception {
        Calculator calc = new Calculator();
        Assert.assertEquals(15, calc.add(10, 5));
    }
    @Test
    public void TestMult1() throws Exception {
        Calculator calc = new Calculator();
        Assert.assertEquals(50, calc.mult(10, 5));
    }
    @Test
    public void TestMult2() throws Exception {
        Calculator calc = new Calculator();
        Assert.assertEquals(0, calc.mult(0, 5));
    }
    @Test
    public void TestSub1() throws Exception {
        Calculator calc = new Calculator();
        Assert.assertEquals(-5, calc.sub(0, 5));
    }
    @Test
    public void TestDiv0() throws Exception{
        Calculator calc = new Calculator();
        Assert.assertEquals(false, calc.div(1, 0).exists);
    }
}