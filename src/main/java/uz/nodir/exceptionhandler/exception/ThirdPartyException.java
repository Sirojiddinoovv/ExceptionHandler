package uz.nodir.exceptionhandler.exception;


import lombok.Getter;

/**
 * @author: PC
 * @date: 23.02.2025
 * @group: DavrCoders
 **/

@Getter
public class ThirdPartyException extends RuntimeException {
    private final String message;
    private final Integer code;

    /*
       We can generate class with multiple fields, which we need in custom situations.
       Don't forget about message field in super class.
     */

    public ThirdPartyException(String message, Integer code) {
        super(message); // If we forgot about set message field, when we catch ThirdPartyException, we can take null message
        this.message = message;
        this.code = code;
    }

    public ThirdPartyException(String message) {
        super(message);
        this.message = message;
        this.code = 500; // If we have only message, set default value to code
    }
}
