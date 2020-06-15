package com.chaos.pangu.web.biz.service;

/**
 * 用户登录。
 *
 * @author pangu
 */
public interface LoginService {

    /**
     * 用户登录.
     *
     * @param username 账号
     * @param password 密码
     * @return 登录是否成功
     */
    public Boolean loginInfo(String username, String password);
}
