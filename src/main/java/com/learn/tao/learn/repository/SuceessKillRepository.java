package com.learn.tao.learn.repository;

import com.learn.tao.learn.entity.SuccessKill;

public interface SuceessKillRepository {
    /**
     *
     * @param seckillId
     * @param id
     * @return
     */
    int insertSuccessKill(long seckillId, long id );

    /**
     *
     * @param seckillId
     * @return
     */
    SuccessKill queryByIdWithSecKill(long seckillId);

}
