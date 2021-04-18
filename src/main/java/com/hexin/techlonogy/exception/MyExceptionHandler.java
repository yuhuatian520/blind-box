package com.hexin.techlonogy.exception;

import com.hexin.techlonogy.utils.json.JsonResult;
import org.apache.http.HttpException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.hexin.techlonogy.utils.json.JsonResult.build;
import static org.springframework.http.HttpStatus.GATEWAY_TIMEOUT;

@RestControllerAdvice
public class MyExceptionHandler{

    @ExceptionHandler(value = MyExceptionInfo.class)
    public JsonResult handlerException(MyExceptionInfo exceptionInfo){
       return build(exceptionInfo.getCode(),exceptionInfo.getMsg(),"");
    }
    @ExceptionHandler(value = NullPointerException.class)
    public JsonResult handlderExceptionNulls(){
        return build(500,"service error","服务内部异常");
    }
    @ExceptionHandler(value = HttpException.class)
    public JsonResult handlderExceptionHttps(){
        return build(GATEWAY_TIMEOUT.value(), GATEWAY_TIMEOUT.name(),"网关超时");
    }



}
