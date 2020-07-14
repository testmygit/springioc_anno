package com.xulihao;

import com.xulihao.config.Config;
import com.xulihao.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class test2 {
    @Autowired
    private UserService userService;
    @Test
    public void testUserService(){
        userService.save();
    }
}
