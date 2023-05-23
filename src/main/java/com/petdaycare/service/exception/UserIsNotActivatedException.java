package com.petdaycare.service.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.LOCKED)
public class UserIsNotActivatedException extends RuntimeException {

    public UserIsNotActivatedException(String s) {
        super(s);
    }
}
