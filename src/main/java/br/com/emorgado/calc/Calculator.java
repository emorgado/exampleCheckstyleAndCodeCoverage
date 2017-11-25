package br.com.emorgado.calc;

public class Calculator {

    public int divide( int x, int y ) {

        if ( y == 0 ) {
            throw new DivisionByZeroException( "Tying to divide "+x+" by zero!" );
        }
        return x / y;
    }
    
    public int multiply( int x, int y ) {
        return x * y;
    }
}
