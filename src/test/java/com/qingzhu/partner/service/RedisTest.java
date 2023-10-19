package com.qingzhu.partner.service;

import com.qingzhu.partner.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * Redis 测试
 *
 * @author qingzhu
 */
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("qingzhuString", "dog");
        valueOperations.set("qingzhuInt", 1);
        valueOperations.set("qingzhuDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("qingzhu");
        valueOperations.set("qingzhuUser", user);
        // 查
        Object qingzhu = valueOperations.get("qingzhuString");
        Assertions.assertTrue("dog".equals((String) qingzhu));
        qingzhu = valueOperations.get("qingzhuInt");
        Assertions.assertTrue(1 == (Integer) qingzhu);
        qingzhu = valueOperations.get("qingzhuDouble");
        Assertions.assertTrue(2.0 == (Double) qingzhu);
        System.out.println(valueOperations.get("qingzhuUser"));
        valueOperations.set("qingzhuString", "dog");
        redisTemplate.delete("qingzhuString");
    }
}
