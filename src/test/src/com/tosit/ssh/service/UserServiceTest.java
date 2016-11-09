package com.tosit.ssh.service;

import com.tosit.ssh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/11/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testAdd(){
        User user = new User();
        user.setName("德华");
        userService.add(user);
    }
}
