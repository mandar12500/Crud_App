package com.crudapp.crud_app.exceptions;

import org.springframework.http.HttpStatus;

public class VendorException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public VendorException (String message, Throwable throwable, HttpStatus httpStatus) {

        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

}
