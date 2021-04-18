package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:JSPController
 * Package:com.bjpowernode.controller
 * Description:<br/>
 *
 * @date:2021/4/14 16:53
 * @author:dingzhengzheng
 */
@Controller
public class JSPController {
    @RequestMapping("/boot/jsp")
    public String jsp(Model model){
        model.addAttribute("msg", "你好jsp");
        return "index";
    }

}
