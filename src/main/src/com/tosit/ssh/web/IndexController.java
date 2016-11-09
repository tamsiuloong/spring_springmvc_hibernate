package com.tosit.ssh.web;

import com.tosit.ssh.entity.User;
import com.tosit.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/10/28.
 */
@Controller
public class IndexController {
    @Autowired
//    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        User user = new User();
        user.setName("刘德华");
        userService.add(user);
        return "index";
    }
}
