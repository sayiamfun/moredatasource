package com.sayimfun.moredatasource.controller;

import com.sayimfun.moredatasource.mapper.test2.Test2UserMapper;
import com.sayimfun.moredatasource.mapper.mytest.TeacherMapper;
import com.sayimfun.moredatasource.mapper.test.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private TestUserMapper testUserMapper;
    @Autowired
    private Test2UserMapper test2UserMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @GetMapping("getTestUserById/{id}/")
    public Object listTestUserAll(@PathVariable("id")Integer id){
        return testUserMapper.selectByPrimaryKey(id);
    }

    @GetMapping("getTest2UserById/{id}/")
    public Object listTest2UserAll(@PathVariable("id")Integer id){
        return test2UserMapper.selectByPrimaryKey(id);
    }

    @GetMapping("getMyTestTeacherById/{id}")
    public Object getMyTestTeacherById(@PathVariable("id")Integer id){
        return teacherMapper.selectByPrimaryKey(id);
    }

}
