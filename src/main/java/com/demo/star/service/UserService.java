package com.demo.star.service;

import com.demo.star.po.User;

/**
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
public interface UserService {

    User checkUser(String username, String password);
}
