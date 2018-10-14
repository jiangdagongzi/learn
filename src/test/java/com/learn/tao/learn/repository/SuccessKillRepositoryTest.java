package com.learn.tao.learn.repository;

import com.learn.tao.learn.entity.SuccessKill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-repository.xml"})
@SpringBootTest
public class SuccessKillRepositoryTest {

    @Autowired
    private SuccessKillRepository successKillRepository;

    @Test
    public void insertSuccessKill() {
        long seckillId = 1002l;
        long id = 1000l;
        int insertResult = successKillRepository.insertSuccessKill(seckillId,id);
        System.out.println(insertResult);
    }

    @Test
    public void queryByIdWithSecKill() {
        long seckillId = 1002l;
        long id = 1000l;
        SuccessKill successKill = successKillRepository.queryByIdWithSecKill(seckillId,id);
        System.out.println(successKill);
        System.out.println(successKill.getSeckill());
    }
}