package com.xyl.springboot;

import com.xyl.springboot.login.entity.LoginInfo;
import com.xyl.springboot.login.service.LoginInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    LoginInfoService loginInfoService;
    @Test
    public void contextLoads2() {
        LoginInfo loginInfoInit = new LoginInfo();
        loginInfoInit.setId("xyl");
        loginInfoInit.setPassword("3160704437");
        List<LoginInfo> loginInfo = loginInfoService.queryAll(loginInfoInit);
        System.out.println("该用户ID为：");
        System.out.println(loginInfo.get(0).getId());
    }
}
