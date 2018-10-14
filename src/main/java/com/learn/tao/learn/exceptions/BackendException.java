package com.learn.tao.learn.exceptions;

public class BackendException extends RuntimeException {
    private int errorCode;
    private String errorMsg;
    public BackendException(int errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
