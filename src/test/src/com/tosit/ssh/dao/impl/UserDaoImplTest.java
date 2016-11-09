package com.tosit.ssh.dao.impl;

import com.tosit.ssh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/11/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
@Transactional
public class UserDaoImplTest {
    @Autowired
    private UserDaoImpl userDao;
    @Test
    public void testAdd(){
        User user = new User();
        user.setName("德华");
        userDao.add(user);
    }
}
