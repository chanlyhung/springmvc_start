package com.chuang.controller;

import com.chuang.domain.Account;
import com.chuang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    /**
        参数绑定(Bean)
        params ： Account

     */
    @RequestMapping("/saveAccount")
    public String save(Account account) {
        System.out.println("Form ...");
        System.out.println(account);
        return "success";
    }


    /**
        自定义类型转换器
     */
    @RequestMapping("/saveUser")
    public String save(User user) {
        System.out.println("Form ...");
        System.out.println(user);
        return "success";
    }

    /**
        传递request，response参数
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Form ...");
        System.out.println(request);
        System.out.println(request.getContextPath());
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        System.out.println(response);
        return "success";
    }

}
