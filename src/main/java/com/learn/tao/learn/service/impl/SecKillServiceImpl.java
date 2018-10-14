package com.learn.tao.learn.service.impl;

import com.learn.tao.learn.Utils.CONSTANTS;
import com.learn.tao.learn.entity.Seckill;
import com.learn.tao.learn.entity.SuccessKill;
import com.learn.tao.learn.exceptions.seckill.RepeatSeckillException;
import com.learn.tao.learn.exceptions.seckill.SeckillClosedException;
import com.learn.tao.learn.exceptions.seckill.SeckillException;
import com.learn.tao.learn.forms.seckill.Exposer;
import com.learn.tao.learn.forms.seckill.SeckillExecution;
import com.learn.tao.learn.repository.SecKillRepository;
import com.learn.tao.learn.repository.SuccessKillRepository;
import com.learn.tao.learn.service.SecKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

@Service
public class SecKillServiceImpl implements SecKillService {
    @Autowired
    private SecKillRepository secKillRepository;
    //logger

    @Autowired
    private SuccessKillRepository successKillRepository;

    private String salt = "N(*YG(*DJOND*Y##RNascnjKLS::<>SP{DK)I#R}";

    @Override
    public List<Seckill> getSeckills() {
        return secKillRepository.queryAll(0, 3);
    }

    @Override
    public Seckill getById(long seckillId) {
        return secKillRepository.queryById(seckillId);
    }

    @Override
    public Exposer exportSeckillUrl(long seckillId) {
        Seckill seckill = secKillRepository.queryById(seckillId);
        if (seckill == null) {
            return new Exposer(false, seckillId);
        }
        Date startTime = seckill.getStartTime();
        Date endTime = seckill.getEndTime();
        Date nowTime = new Date();
        if (nowTime.getTime() < startTime.getTime() || nowTime.getTime() > endTime.getTime()) {
            return new Exposer(false, seckillId, nowTime.getTime(), startTime.getTime(), endTime.getTime());
        }
        String md5 = getMD5(seckillId);
        return new Exposer(true, md5, seckillId);
    }

    private String getMD5(long seckillId) {
        String base = seckillId + salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

    @Override
    public SeckillExecution executeSeckill(long seckillId, long id, String md5) throws SeckillClosedException, RepeatSeckillException, SeckillException {
        if (md5 == null || md5.equals(getMD5(seckillId)))
            throw new SeckillException(CONSTANTS.MD5_INCORRECT, CONSTANTS.MD5_INCORRECT_MSG);
        try {
            Date nowTime = new Date();
            int updateCount = secKillRepository.reduceNumber(seckillId, nowTime);
            if (updateCount <= 0)
                throw new SeckillClosedException(CONSTANTS.SECKILL_END, CONSTANTS.SECKILL_END_MSG);
            else {
                int insertCount = successKillRepository.insertSuccessKill(seckillId, id);
                if (insertCount<=0)
                    throw  new RepeatSeckillException(CONSTANTS.REPEAT_SECKILL,CONSTANTS.REPEAT_SECKILL_MSG);
                else {
                    SuccessKill successKill = successKillRepository.queryByIdWithSecKill(seckillId,id);
                    return new SeckillExecution(seckillId,1,"",successKill);
                }
            }
        }catch (SeckillClosedException e1){
            throw e1;
        }
        catch (RepeatSeckillException e2){
            throw e2;
        }
        catch (Exception e){
            throw new SeckillException(CONSTANTS.SECKILL_FAILURE,CONSTANTS.SECKILL_FAILURE_MSG);
        }
    }
}
