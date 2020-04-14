package com.chuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chuang
 * @date 2020/04/13 - 21:37
 *
 * 控制器类
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello springMVC");
        return "success";
    }

    /**
        requestMapping注解，作用于类及方法
        value,path功能一样，value只有一个属性时可省略
        method = RequestMethod.POST请求方式
        params ： user/requestMapping？username=hello

     */
    @RequestMapping(path="/requestMapping", params = {"username"})
    public String testRequestMapping(){
        System.out.println("requestMapping注解");
        return "success";
    }

}
