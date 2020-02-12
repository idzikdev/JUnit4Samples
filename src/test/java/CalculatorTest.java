import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    /***
     * method is calling before all tests
     */
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Before all tests");
    }

    /***
     * method is calling before each test
     */
    @Before
    public void beforeEachTests() {
        System.out.println("Before each test");
    }

    /***
     * method is calling after each test
     */
    @After
    public void afterEachTest() {
        System.out.println("After each test");
    }

    /***
     * method is calling after all tests
     */

    @AfterClass
    public static void afterAllTests() {
        System.out.println("After all tests");
    }

    /***
     * method is checking the addition of two numbers
     */
    @Test
    public void should_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(10, 15);
        //then
        assertEquals(25, result);
    }

    /***
     * method is checking the addition of two numbers
     */
    @Test
    public void should_not_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(11, 15);
        //then
        assertNotEquals(25, result);
    }

    /**
     * method is checking the division of two numbers
     */
    @Test
    public void should_divide_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(100, 10);
        //then
        assertEquals(10, result);
    }

    /**
     * method is checking the division of two numbers
     */
    @Test(expected = ArithmeticException.class)
    public void should_not_divide_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result=calculator.divide(100,0);
        //then
    }
}