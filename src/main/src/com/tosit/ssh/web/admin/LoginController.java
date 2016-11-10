package com.tosit.ssh.web.admin;

import com.tosit.ssh.entity.User;
import com.tosit.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/11/10.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        boolean isOk = userService.isOk(user);
        return "admin/index.html";
    }
}
