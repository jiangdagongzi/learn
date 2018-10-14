package com.learn.tao.learn.repository;

import com.learn.tao.learn.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration({"classpath:spring/spring-repository.xml"})
public class SecKillRepositoryTest {
    @Autowired
    private SecKillRepository secKillRepository;

    @Test
    public void queryById() throws Exception {
        long id = 1000;
        Seckill seckill = secKillRepository.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill.toString());
    }


    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckills = secKillRepository.queryAll(0, 100);
        for (Seckill seckill : seckills) {
            System.out.println(seckill.toString());
        }
    }

    @Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int updateCount = secKillRepository.reduceNumber(1000L,killTime);
        System.out.println(updateCount);
        System.out.println(updateCount);
    }

}