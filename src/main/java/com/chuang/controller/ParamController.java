package com.chuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chuang
 * @date 2020/04/13 - 21:37
 *
 * 控制器类
 */
@Controller
@RequestMapping(path = "/param")
public class ParamController {


    /**
        参数绑定
        params ： user/requestMapping？username=hello

     */
    @RequestMapping("/testParam")
    public String testRequestMapping(String username, String password){
        System.out.println("requestMapping注解");
        System.out.println("name = " + username);
        System.out.println("pass = " + password);
        return "success";
    }

}
