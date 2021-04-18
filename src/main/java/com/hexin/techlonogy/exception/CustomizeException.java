package com.hexin.techlonogy.exception;

import com.hexin.techlonogy.utils.json.JsonResult;
import lombok.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

import static com.hexin.techlonogy.utils.json.JsonResult.build;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.FORBIDDEN;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RestControllerAdvice
public class CustomizeException extends RuntimeException{

    private Integer code;
    private String message;

    @ExceptionHandler(CustomizeException.class)
    public JsonResult handlerException(){
           return build(FORBIDDEN.value(), FORBIDDEN.name(),"第三方接口异常");
    }

        @ExceptionHandler({MethodArgumentNotValidException.class})
        public JsonResult methodDtoNotValidException(Exception ex) {
            val c = (MethodArgumentNotValidException) ex;
            var errors = c.getBindingResult().getAllErrors();
            val errorMsg = new StringBuffer();
            errors.stream().forEach(x -> {
                errorMsg.append(x.getDefaultMessage());
            });
           return build(BAD_REQUEST.value(),errorMsg.toString(),null);
        }

    @ExceptionHandler(ConstraintViolationException.class)
    public JsonResult methodArgNotValidException(ConstraintViolationException cve) {
        var cves = cve.getConstraintViolations();
        val errorMsg = new StringBuffer();
        cves.forEach(ex -> errorMsg.append(ex.getMessage()));
        return build(BAD_REQUEST.value(),errorMsg.toString(),null);
    }


}
