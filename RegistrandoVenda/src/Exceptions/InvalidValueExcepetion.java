package Exceptions;

public class InvalidValueExcepetion extends  Exception {


    private static final long serialVersionUID = 1949841039409561914L;
    public InvalidValueExcepetion(String msg){
        super(msg);
    }

    public InvalidValueExcepetion(String msg, Throwable cause){
        super(msg, cause);
    }


}
