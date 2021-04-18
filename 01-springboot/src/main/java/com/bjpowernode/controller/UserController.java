package com.bjpowernode.controller;

import com.bjpowernode.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.controller
 * Description:<br/>
 *
 * @date:2021/4/14 16:09
 * @author:dingzhengzheng
 */
@RestController
public class UserController {
    @RequestMapping("/boot/user")
    public Object user(){
        User user =new User();
        user.setName("张小小");
        user.setPhone(137000000);
        user.setId("1");
        return  user;
    }
}
