package com.tosit.ssh.service;


import com.tosit.ssh.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/10/27.
 */
@Service

public class UserService extends BaseService<User> {
    @Override
    @Transactional
    public void add(User user) {
        baseDao.add(user);
        //添加用户操作日志(admin添加一个新用户xxx)
        //logDao.add(log);
    }
}
