package com.cninfo.redis;

import com.cninfo.SpringRedisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRedisApplication.class)
public class RedisTemplateApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRedis() {
    }
}
