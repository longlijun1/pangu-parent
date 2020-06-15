package com.chaos.pangu.web.api.controller;

import com.chaos.pangu.web.biz.response.CreatResponseFactory;
import com.chaos.pangu.web.biz.response.SimpleResponse;
import com.chaos.pangu.web.biz.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录服务。
 *
 * @author longlijun
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/get")
    public SimpleResponse loginInfo(String username, String password) {
        Boolean flag = loginService.loginInfo(username, password);
        SimpleResponse simpleResponse = CreatResponseFactory.creatSimpleResponse();
        if (flag) {
            simpleResponse.add("msg", "登录成功");
        } else {
            simpleResponse.add("msg", "登录失败");
        }
        return simpleResponse;
    }
}
