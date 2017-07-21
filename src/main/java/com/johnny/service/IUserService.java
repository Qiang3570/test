package com.johnny.service;

import com.johnny.common.ServerResponse;
import com.johnny.pojo.User;

/**
 * Created by Johnny on 2017/7/21.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

}