package com.it.web.service;

import com.it.web.common.ApiRestResponse;
import com.it.web.model.entity.User;

public interface UserService {
    void insertUserInfo(User user);

    User getUserInfo(User user);

    void update(User user);

    void delete(User user);
}
