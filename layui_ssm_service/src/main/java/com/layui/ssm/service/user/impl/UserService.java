package com.layui.ssm.service.user.impl;

import com.layui.ssm.dao.user.UserDao;
import com.layui.ssm.domain.user.User;
import com.layui.ssm.service.user.IUserService;
import layui.ssm.enums.ExceptionEnum;
import layui.ssm.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    public User addUser(User user) {
        // 1. 先查询用户名是否存在
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username",user.getUsername());
        List<User> users = userDao.selectByExample(example);
        if(!CollectionUtils.isEmpty(users)){
            throw new UserException(ExceptionEnum.USERNAME_ALREADY_EXIST);
        }
        userDao.insertSelective(user);
        return user;
    }
}
