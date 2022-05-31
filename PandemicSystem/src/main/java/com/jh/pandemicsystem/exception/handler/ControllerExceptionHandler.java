package com.jh.pandemicsystem.exception.handler;

import com.jh.pandemicsystem.exception.ErrorMsg;
import com.jh.pandemicsystem.exception.ResurceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResurceNotFoundException.class)
    public ResponseEntity<ErrorMsg> resourceNotFoundException(ResurceNotFoundException ex, WebRequest request){
        ErrorMsg message = new ErrorMsg(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<ErrorMsg>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMsg> globalExceptionHandler(Exception ex, WebRequest request) {
        ErrorMsg message = new ErrorMsg(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<ErrorMsg>(message, HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
