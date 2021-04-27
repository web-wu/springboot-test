package com.w2x.springboot;

import com.w2x.springboot.entity.User;
import com.w2x.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1() {
        User tony = userService.findOne(1L);
        System.out.println(tony);
    }

    @Test
    public void test2() {
        User user = new User();
        user.setUsername("tom");
        user.setAge(40);
        user.setGender("female");
        userService.addUser(user);
    }

    @Test
    public void test3() {
        redisTemplate.boundValueOps("name").set("zhansan");

        redisTemplate.boundHashOps("user").put("username", "lisi");
        redisTemplate.boundHashOps("user").put("age", 25);
        redisTemplate.boundHashOps("user").put("gender", "female");

        redisTemplate.boundListOps("numList").leftPush("a");
        redisTemplate.boundListOps("numList").leftPush("b");
        redisTemplate.boundListOps("numList").leftPush("c");
        redisTemplate.boundListOps("numList").rightPush("a");
        redisTemplate.boundListOps("numList").rightPush("b");
        redisTemplate.boundListOps("numList").rightPush("c");

        redisTemplate.boundSetOps("setObj").add("tom");
        redisTemplate.boundSetOps("setObj").add("kity");
        redisTemplate.boundSetOps("setObj").add("lucy");

        redisTemplate.boundZSetOps("zSetObj").add("wangwu", 50);
        redisTemplate.boundZSetOps("zSetObj").add("zhaoliu", 40);
        redisTemplate.boundZSetOps("zSetObj").add("tianqi", 90);
    }
}
