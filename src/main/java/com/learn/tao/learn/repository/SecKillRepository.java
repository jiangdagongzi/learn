package com.learn.tao.learn.repository;

import com.learn.tao.learn.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SecKillRepository {
    /**
     *
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     *
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet,int limit);

}
