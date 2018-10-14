package com.learn.tao.learn.service;

import com.learn.tao.learn.entity.Seckill;
import com.learn.tao.learn.exceptions.seckill.RepeatSeckillException;
import com.learn.tao.learn.exceptions.seckill.SeckillClosedException;
import com.learn.tao.learn.exceptions.seckill.SeckillException;
import com.learn.tao.learn.forms.seckill.Exposer;
import com.learn.tao.learn.forms.seckill.SeckillExecution;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SecKillService {
    /**
     *
     * @return
     */
    List<Seckill> getSeckills();

    /**
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     *
     * @param seckillId
     * @return
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * @param seckillId
     * @param id
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long id, String md5) throws SeckillClosedException, RepeatSeckillException, SeckillException;

}
