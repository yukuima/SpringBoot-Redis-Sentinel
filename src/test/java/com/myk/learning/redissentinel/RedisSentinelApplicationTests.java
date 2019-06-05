package com.myk.learning.redissentinel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisSentinelApplicationTests {

    @Autowired
    RedisSentinelPool redisSentinelPool;

    @Test
    public void contextLoads() {
        redisSentinelPool.setex("dasha", "上天哦!", 60);
        System.out.println(redisSentinelPool.get("dasha"));
    }

}
