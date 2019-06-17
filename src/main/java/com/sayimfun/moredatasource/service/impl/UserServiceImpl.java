package com.sayimfun.moredatasource.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sayimfun.moredatasource.common.requestentity.QueryUser;
import com.sayimfun.moredatasource.entity.User;
import com.sayimfun.moredatasource.mapper.test2.Test2UserMapper;
import com.sayimfun.moredatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Test2UserMapper test2UserMapper;

    /**
     * 条件分页查询用户
     *
     * @param pageNum
     * @param pageSize
     * @param queryUser
     * @return
     */
    @Override
    public PageInfo<User> listAllUser(Integer pageNum, Integer pageSize, QueryUser queryUser) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = test2UserMapper.listAllUser(queryUser);
        PageInfo result = new PageInfo(userList);
        return result;
    }
}
