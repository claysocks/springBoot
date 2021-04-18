package com.bjpowernode.controller;

import com.bjpowernode.model.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:HelloController
 * Package:com.bjpowernode.controller
 * Description:<br/>
 *
 * @date:2021/4/14 12:49
 * @author:dingzhengzheng
 */
@Controller
public class HelloController {
    @Value("${info.site.url}")
    private String url;
    @Value("${info.site.tel}")
    private String tel;
    @Autowired
    private ConfigInfo configInfo;
    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){

        return "hello-springboot";
    }

    @RequestMapping("/boot/config")
    public @ResponseBody String config(){

        return url+"----"+tel+"===="+configInfo.getUrl()+"===="+configInfo.getTel();
    }
}
