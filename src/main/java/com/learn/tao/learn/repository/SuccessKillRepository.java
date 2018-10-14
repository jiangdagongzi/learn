package com.learn.tao.learn.repository;

import com.learn.tao.learn.entity.SuccessKill;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SuccessKillRepository {
    /**
     *
     * @param seckillId
     * @param id
     * @return
     */
    int insertSuccessKill(@Param("seckillId") long seckillId, @Param("id") long id );

    /**
     *
     * @param seckillId
     * @return
     */
    SuccessKill queryByIdWithSecKill(@Param("seckillId") long seckillId,@Param("id") long id);

}
