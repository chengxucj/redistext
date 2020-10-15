package com.example.redistext.until;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 一些声明信息
 * ClassName: liuweiyi <br/>
 * Description: <br/>
 * date: 2020/10/13 22:34<br/>
 *
 * @author 19684<br />
 * @since JDK 1.8
 */
@Component
public class reidsUtil {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public boolean expire(String key, long expire) {
        return stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }

    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key,delta);
    }
}
