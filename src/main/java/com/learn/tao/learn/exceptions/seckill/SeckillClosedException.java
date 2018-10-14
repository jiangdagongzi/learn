package com.learn.tao.learn.exceptions.seckill;

import com.learn.tao.learn.exceptions.BackendException;

public class SeckillClosedException extends BackendException {
    public SeckillClosedException(int errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

}
