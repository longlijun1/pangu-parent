package com.chaos.pangu.web.biz.dao;

import org.apache.ibatis.annotations.Param;

/**
 * 用户登录。
 *
 * @author pangu
 */
public interface LoginMapper {

    int loginInfo(@Param("username") String username, @Param("password") String password);
}
