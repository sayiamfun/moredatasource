package com.sayimfun.moredatasource.mapper.test2;

import com.sayimfun.moredatasource.common.requestentity.QueryUser;
import com.sayimfun.moredatasource.entity.User;

import java.util.List;

public interface Test2UserMapper {

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> listAllUser(QueryUser queryUser);
}