package com.sayimfun.moredatasource.service;

import com.github.pagehelper.PageInfo;
import com.sayimfun.moredatasource.common.requestentity.QueryUser;
import com.sayimfun.moredatasource.entity.User;

public interface UserService {

    PageInfo<User> listAllUser(Integer pageNum, Integer pageSize, QueryUser queryUser);
}
