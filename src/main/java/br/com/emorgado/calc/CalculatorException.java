package br.com.emorgado.calc;

public abstract class CalculatorException
                                          extends
                                          RuntimeException {

    private static final long serialVersionUID = 1L;

    int code;

    public CalculatorException( int code, String message ) {

        super( message );
        this.code = code;
    }

    public int getErrCode() {

        return code;
    }

}
