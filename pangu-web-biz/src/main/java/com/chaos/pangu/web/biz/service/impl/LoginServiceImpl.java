package com.chaos.pangu.web.biz.service.impl;

import com.chaos.pangu.web.biz.dao.LoginMapper;
import com.chaos.pangu.web.biz.service.LoginService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


/**
 * 用户登录。
 *
 * @author pangu
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    /**
     * 用户登录.
     *
     * @param username 账号
     * @param password 密码
     * @return 登录是否成功
     */
    @Override
    public Boolean loginInfo(String username, String password) {
        int number = loginMapper.loginInfo(username, password);
        return number > 0;
    }
}
