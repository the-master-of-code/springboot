package com.xyl.springboot.login.controller;

import com.xyl.springboot.login.entity.LoginInfo;
import com.xyl.springboot.login.service.LoginInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号密码表(LoginInfo)表控制层
 *
 * @author makejava
 * @since 2020-11-20 08:59:12
 */
@RestController
@RequestMapping("/loginInfo")
public class LoginInfoController {
    /**
     * 服务对象
     */
    @Resource
    private LoginInfoService loginInfoService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LoginInfo selectOne(String id) {
        return this.loginInfoService.queryById(id);
    }

//    @RequestMapping("login")
//    public  String show(){
//        return "login";
//    }

    @RequestMapping(value = "/login")/*,method = RequestMethod.POST*/
    public String login(LoginInfo loginInfo){
        List<LoginInfo> loginInfoResult = loginInfoService.queryAll(loginInfo);
        if (loginInfoResult != null){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping(value = "getUser/{id}")
    public String getUser(@PathVariable String id){
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setId(id);
        List<LoginInfo> loginInfoResult = loginInfoService.queryAll(loginInfo);
        if (loginInfoResult != null){
            return loginInfoResult.get(0).toString();
        }else {
            return "error";
        }
    }
}