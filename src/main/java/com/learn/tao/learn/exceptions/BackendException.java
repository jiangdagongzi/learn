package com.learn.tao.learn.exceptions;

import com.learn.tao.learn.Utils.Error;

public class BackendException extends RuntimeException {
    private Error error;
    public BackendException(Error error){

    }

}
