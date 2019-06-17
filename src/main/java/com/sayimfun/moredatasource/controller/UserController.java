package com.sayimfun.moredatasource.controller;

import com.sayimfun.moredatasource.common.ApiResult;
import com.sayimfun.moredatasource.common.requestentity.QueryUser;
import com.sayimfun.moredatasource.mapper.test2.Test2UserMapper;
import com.sayimfun.moredatasource.mapper.mytest.TeacherMapper;
import com.sayimfun.moredatasource.mapper.test.TestUserMapper;
import com.sayimfun.moredatasource.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Api(description = "测试API")
@RestController
public class UserController {

    @Autowired
    private TestUserMapper testUserMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private TeacherMapper teacherMapper;

    @ApiOperation(value = "根据id查询test数据库的user", notes = "根据id查询test数据库的user")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "int", paramType = "path")
    @GetMapping("getTestUserById/{id}/")
    public ApiResult listTestUserAll(
            @NotNull(message = "用户id不能为空")
            @PathVariable("id")Integer id
    ){
        return ApiResult.success().data(testUserMapper.selectByPrimaryKey(id));
    }

    @ApiOperation(value = "分页查询test2数据库的user", notes = "分页查询test2数据库的user")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "queryUser", value = "查询参数", required = true, dataType = "QueryUser")
    })
    @PostMapping("/listTest2User/{pageNum}/{pageSize}/")
    public ApiResult listTest2UserAll(
            @NotNull(message = "页码不能为空")
            @PathVariable("pageNum")Integer pageNum,

            @NotNull(message = "每页条数不能为空")
            @PathVariable("pageSize")Integer pageSize,

            @RequestBody QueryUser queryUser

    ){
        return ApiResult.success().data(userService.listAllUser(pageNum, pageSize, queryUser));
    }

    @ApiOperation(value = "根据id查询mytest数据库的teacher", notes = "根据id查询mytest数据库的teacher")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "int", paramType = "path")
    @GetMapping("getMyTestTeacherById/{id}")
    public ApiResult getMyTestTeacherById(
            @NotNull(message = "教师id不能为空")
            @PathVariable("id")Integer id
    ){
        return ApiResult.success().data(teacherMapper.selectByPrimaryKey(id));
    }

}
