package br.com.emorgado.calc;

public class DivisionByZeroException
                                     extends
                                     CalculatorException {

    private static final long serialVersionUID = 1L;

    public DivisionByZeroException( String message ) {

        super( 1, message );
    }
    
}
