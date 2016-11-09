//package com.tosit.ssh.dao.impl;
//
//import com.tosit.ssh.entity.User;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 佛祖保佑       永无BUG
// * Created by DELL on 2016/11/2.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("/spring.xml")
//public class JdbcTemplateDaoTest {
//
//    @Autowired
//    private JdbcTemplateDao jdbcTemplateDao ;
//    @Test
//    public void testAdd(){
//        User user = new User();
//        user.setName("八戒");
//
//        jdbcTemplateDao.add(user);
//    }
//
//    @Test
//    public void testGetById(){
//        User user = jdbcTemplateDao.getById(1);
//        Assert.assertNotNull(user);
//    }
//
//    @Test
//    public void testGetList(){
//        List<User> userList = jdbcTemplateDao.getUserList();
//        Assert.assertNotNull(userList);
//        Assert.assertEquals(2,userList.size());
//        Assert.assertEquals("刘德华",userList.get(0).getName());
//    }
//
//    @Test
//    public void testBatchUpdate(){
//        List<Integer> ids = new ArrayList<>();
//        List<String> names = new ArrayList<>();
//
//        ids.add(1);
//        ids.add(2);
//
//        names.add("悟空");
//        names.add("吴京");
//        jdbcTemplateDao.batchUpdate(ids,names);
//    }
//}
