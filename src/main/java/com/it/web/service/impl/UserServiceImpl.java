package com.it.web.service.impl;

import com.it.web.common.Constant;
import com.it.web.mapper.UserMapper;
import com.it.web.model.entity.User;
import com.it.web.service.UserService;
import com.it.web.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void insertUserInfo(User user){
        user.setCreateTime(DateUtils.getNowDate());
        user.setIsDeleted(Constant.NOT_DELETED);
        userMapper.insertSelective(user);
    }

    @Override
    public User getUserInfo(User user){
        return userMapper.selectByPrimaryKey(user);
    }

    @Override
    public void update(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(User user){
        userMapper.deleteByPrimaryKey(user.getUserId());
    }
}
