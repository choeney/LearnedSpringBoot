package com.example.SpringBootTest.Controller;

import com.example.SpringBootTest.Exceptions.InvalidUsernameException;
import com.example.SpringBootTest.Exceptions.UserNotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionController {

    @ExceptionHandler(value = UserNotFoundExceptions.class)
    public ResponseEntity<Object> handleWhenUserNotFound(UserNotFoundExceptions userNotFoundExceptions){
        return new ResponseEntity<Object>(userNotFoundExceptions.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = InvalidUsernameException.class)
    public ResponseEntity<Object> handleWhenInvalidUsername(InvalidUsernameException invalidUsernameException){
        return new ResponseEntity<Object>(invalidUsernameException.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
