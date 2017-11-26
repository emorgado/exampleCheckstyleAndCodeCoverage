package br.com.emorgado.calc;

public class DivisionByZeroException
                                     extends
                                     CalculatorException {

    public static final int   ERROR_CODE       = 1;
    private static final long serialVersionUID = 1L;

    public DivisionByZeroException( String message ) {

        super( 1, message );
    }

}
