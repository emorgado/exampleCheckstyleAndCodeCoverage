package br.com.emorgado.calc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {}

    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testDivide() {

        int dividend = 4;
        int divisor = 2;

        assertEquals( 2, this.calculator.divide( dividend, divisor ) );

    }

    @Test
    public void testDivideByZero() throws RuntimeException {

        int dividend = 4;
        int divisor = 0;

        // test exception type
        thrown.expect( DivisionByZeroException.class );

        // test exception message
        thrown.expectMessage( is( "Tying to divide 4 by zero!" ) );

        // test exception custom data
        thrown.expect( hasProperty( "errCode" ) ); // make sure getters n setters are defined.
        thrown.expect( hasProperty( "errCode", is( 1 ) ) );

        this.calculator.divide( dividend, divisor );

    }

}
