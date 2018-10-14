package com.learn.tao.learn.exceptions.seckill;

import com.learn.tao.learn.exceptions.BackendException;

public class RepeatSeckillException extends BackendException {

    public RepeatSeckillException(int errorCode,String errorMsg) {
        super(errorCode,errorMsg);
    }
}
