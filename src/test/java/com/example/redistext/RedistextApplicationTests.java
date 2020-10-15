package com.example.redistext;

import com.example.redistext.until.reidsUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedistextApplicationTests {

    @Autowired
    reidsUtil reidsutil;

    @Test
    void contextLoads() {
        reidsutil.set("k2","111");
        String k1=reidsutil.get("k1");
        System.out.println(k1);
    }

}
