package com.apress.errorMessagePrinter;

import com.apress.error.ErrorDetail;
import com.apress.error.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setTimeStamp(new Date().getTime());
        errorDetail.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetail.setTitle(" not founddd ");
        String errorMessage = ex.getMessage();
        errorDetail.setDetail(errorMessage);
        errorDetail.setDeveloperMessage("Please make sure to read the list first before picking a number my friend");
        return new ResponseEntity<>(errorMessage + errorDetail, HttpStatus.NOT_FOUND);
    }
}
