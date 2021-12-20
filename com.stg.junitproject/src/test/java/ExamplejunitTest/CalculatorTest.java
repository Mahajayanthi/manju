package ExamplejunitTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.reflect.Executable;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import Examplejunit.Calculator;

public class CalculatorTest {

	/*
	 * @Test public void test() { Calculator a=new Calculator(); int actual=a.add(2,
	 * 8); int excepted=10; assertEquals(excepted,actual);
	 * 
	 * }
	 */
	
	@Test
	void divideTest(){
        Calculator calculator = new Calculator();
        double i = 4.0;
        double j = 0.0;
        double expected = 2.0;

        double actual = calculator.divide(i,j);

        assertEquals(expected, actual);
    }
	@Test
    @DisplayName("Throw Exception when j is 0")
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void throwArithmeticExceptionIfJisZeroTest(){
        Calculator calculator = new Calculator();
        double i = 4.0;
        double j = 0.0;
       // double expected = 2.0;

        Executable executable = ()->calculator.divide(i,j);

        assertThrows(ArithmeticException.class, executable);
    }
	
	}


}

}
