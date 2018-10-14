package com.learn.tao.learn.exceptions.seckill;

import com.learn.tao.learn.exceptions.BackendException;

public class SeckillException extends BackendException {
    public SeckillException(int errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
