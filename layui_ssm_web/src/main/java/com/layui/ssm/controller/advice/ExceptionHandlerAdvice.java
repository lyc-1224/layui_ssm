package com.layui.ssm.controller.advice;

import layui.ssm.exception.UserException;
import layui.ssm.utils.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(UserException.class)
    @ResponseBody
    public ResponseUtil<Void> handleException(UserException e){
        return new ResponseUtil<Void>(e.getExceptionEnum().getCode(),e.getExceptionEnum().getMsg());
    }
}
