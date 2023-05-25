import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    //TestAdd
    @Test
    public void testAdd() {
        // Test case for add() method
        int a = 1234;
        int b = 8765;

        Calculator cal = new Calculator();
        int actual = cal.add(a, b);

        int expected = 9999;
        assertEquals(expected, actual);
    }
    
    //TestSubtract
    @Test
    public void testSubtract() {
        // Test case for subtract() method
        int a = 9876;
        int b = 4321;

        Calculator cal = new Calculator();
        int actual = cal.subtract(a, b);

        int expected = 5555;
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        // Test case for multiply() method
        int a = 123;
        int b = 321;

        Calculator cal = new Calculator();
        int actual = cal.multiply(a, b);

        int expected = 39483;
        assertEquals(expected, actual);
    }

    @Test
	public void testDivide() {
		int a=100;
		int b=2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		int expected = 50;
		
		if (b==0) {
			assertFalse("Error",(b==0));
		}else {
		assertEquals (actual,expected);
		}
		
	}

  
}
