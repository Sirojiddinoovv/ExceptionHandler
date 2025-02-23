package uz.nodir.exceptionhandler.exception;


/**
 * @author: PC
 * @date: 23.02.2025
 * @group: DavrCoders
 **/

public class InsufficientFundsException extends RuntimeException {

    /*
        2nd way, Override constructor(s) from RunTimeException
     */

    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientFundsException(Throwable cause) {
        super(cause);
    }

    public InsufficientFundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
