package com.sayimfun.moredatasource.mapper.test;

import com.sayimfun.moredatasource.entity.User;

public interface TestUserMapper {

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}