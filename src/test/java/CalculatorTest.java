import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator=new Calculator();

    @Test
    public void testRun(){
        int result=calculator.sum(2,5);
        assertEquals(7,result);
    }

}