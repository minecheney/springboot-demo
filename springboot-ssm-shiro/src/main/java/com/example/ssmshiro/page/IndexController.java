package com.example.ssmshiro.page;

import com.example.ssmshiro.bean.User;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/list")
    public String index(Model model){
        // 登录成后，即可通过Subject获取登录的用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("user", user);
        return "list";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }
}
