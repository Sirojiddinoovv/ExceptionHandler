package uz.nodir.exceptionhandler.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import uz.nodir.exceptionhandler.exception.GeneralException;
import uz.nodir.exceptionhandler.exception.InsufficientFundsException;
import uz.nodir.exceptionhandler.exception.ThirdPartyException;
import uz.nodir.exceptionhandler.model.dto.core.response.ResultData;

/**
 * @author: PC
 * @date: 23.02.2025
 * @group: DavrCoders
 **/

@RestControllerAdvice
@Slf4j
public class RestAdviceConfig {

    /*
            Handling own exceptions
     */

    @ExceptionHandler(value = {GeneralException.class, InsufficientFundsException.class})
    public ResponseEntity<ResultData> handleOwnDefaultException(RuntimeException e) {
        log.error("Taken own default exception with message: {}", e.getMessage());
        return ResponseEntity.ok(
                new ResultData(400, e.getMessage())
        );
    }

    @ExceptionHandler(value = ThirdPartyException.class)
    public ResponseEntity<ResultData> handleThirdPartyException(ThirdPartyException e) {
        log.error("Taken Third Party exception with message: {}", e.getMessage());
        ResultData result;

        if (e.getCode() == null)
            result = new ResultData(400, e.getMessage());
        else
            result = new ResultData(e.getCode(), e.getMessage());

        return ResponseEntity.ok(result);
    }


    /*
            Handling checked exceptions
     */

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> httpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.error("Taken core error. Received request body is not readable. Cause: {}", e.getMessage());
        return ResponseEntity.ok(
                new ResultData(-100012, "HTTP message not readable")
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error("Taken core error. Received field is incorrect. Cause: {}", e.getMessage());
        return ResponseEntity.ok(
                new ResultData(-100013, "Fields filled incorrectly or maybe not presented")
        );
    }

}
