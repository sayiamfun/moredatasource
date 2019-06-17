package com.sayimfun.moredatasource.service;

import com.sayimfun.moredatasource.entity.User;

public interface UserService {

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
