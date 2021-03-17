package com.xt.bihu.service;

import com.xt.bihu.entity.User;
import com.xt.bihu.entity.UserExample;
import com.xt.bihu.mapper.UserMapper;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(String account, String password) {
        List<User> users;
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserPasswordEqualTo(DigestUtils.md5Hex(password));
        if (account.contains("@")) {
            criteria.andEmailEqualTo(account);
            users = userMapper.selectByExampleWithBLOBs(userExample);
        } else {
            criteria.andUserNameEqualTo(account);
            users = userMapper.selectByExampleWithBLOBs(userExample);
        }
        return users.size() == 0 ? null : users.get(0);
    }

    public User registerUser(User user) {
        int i = userMapper.insertSelective(user);
        return i == 0 ? null : userMapper.selectByPrimaryKey(user.getUserId());
    }
}
