package com.learn.tao.learn.exceptions.user;

import com.learn.tao.learn.exceptions.BackendException;

public class UserNameRepeatException extends BackendException {
    public UserNameRepeatException(Error error) {
        super(error);
    }
}
