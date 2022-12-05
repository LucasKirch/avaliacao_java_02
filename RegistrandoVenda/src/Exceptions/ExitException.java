package Exceptions;

public class ExitException extends  Exception {

    private static final long serialVersionUID = 1149841039409861914L;
    public ExitException(String msg){
        super(msg);
    }

    public ExitException(String msg, Throwable cause){
        super(msg, cause);
    }

}


