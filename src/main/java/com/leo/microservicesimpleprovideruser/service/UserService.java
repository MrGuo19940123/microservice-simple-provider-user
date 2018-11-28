package com.leo.microservicesimpleprovideruser.service;

import com.leo.microservicesimpleprovideruser.domain.User;

public interface UserService {

    /***
     * 描述:根据用户Id获取用户信息<功能详细描述>
     * @Params [id]
     * @return User
     */
    User findById(Long id);
}
