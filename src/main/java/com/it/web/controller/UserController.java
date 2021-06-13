package com.it.web.controller;

import com.it.web.common.ApiRestResponse;
import com.it.web.exception.DigitalPlatformExceptionEnum;
import com.it.web.model.entity.Person;
import com.it.web.model.entity.User;
import com.it.web.model.req.UserGisterReq;
import com.it.web.service.PersonService;
import com.it.web.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PersonService personService;

    @ApiOperation("注册用户信息")
    @PostMapping("/register")
    public ApiRestResponse register(@RequestBody User user){
        userService.insertUserInfo(user);
        return ApiRestResponse.success("注册成功");
    }

    @ApiOperation("登录")
    @PostMapping("/login")
    public ApiRestResponse login(@RequestBody UserGisterReq req){
        User user = new User();
        user.setUserName(req.getUserName());
        user.setUserPassword(req.getUserPassword());
        User userInfo = userService.getUserInfo(user);

        List<Person> personList = personService.getPersonByUserId(userInfo.getUserId());
        if(null==personList){
            userInfo.setResume(0);
        }else{
            userInfo.setResume(1);
        }
        if(null == userInfo){
            return ApiRestResponse.error(DigitalPlatformExceptionEnum.USER_NOT_EXIST);
        }
        return ApiRestResponse.success(userInfo);
    }

    @ApiOperation("修改用户信息")
    @PostMapping("/update")
    public ApiRestResponse update(@RequestBody User user){
        userService.update(user);
        return ApiRestResponse.success("修改成功");
    }

    @ApiOperation("删除用户信息")
    @PostMapping("/delete")
    public ApiRestResponse delete(@RequestBody User user){
        userService.delete(user);
        return ApiRestResponse.success("删除成功");
    }


}
