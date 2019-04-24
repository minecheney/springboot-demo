package com.example.ssmshiro.controller;

import com.example.ssmshiro.bean.User;
import com.example.ssmshiro.common.CryptographyUtil;
import com.example.ssmshiro.common.ResponseBody;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    public static Logger log = LoggerFactory.getLogger(LoginController.class);

    @PostMapping("/login")
    public ResponseBody login(User user){
        log.debug(user.toString());
        // 密码MD5加密
        String password = CryptographyUtil.md5(user.getPassword(),"mine");
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), password);
        // 获取Subject对象
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return ResponseBody.body(200);
        } catch (UnknownAccountException e) {
            return ResponseBody.body(401,e.getMessage());
        } catch (IncorrectCredentialsException e) {
            return ResponseBody.body(402,e.getMessage());
        } catch (LockedAccountException e) {
            return ResponseBody.body(403,e.getMessage());
        } catch (AuthenticationException e) {
            return ResponseBody.body(405,e.getMessage());
        }
    }
}
