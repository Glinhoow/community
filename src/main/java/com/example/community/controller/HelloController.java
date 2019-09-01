package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    //@RequestParam(name = "name") 请求拿到网页传过来的数据name
    //String name 把传过来的数据赋给name
    //Model model 通过model方法把参数带到页面
    public String hello(@RequestParam(name = "name") String name,Model model) {

        model.addAttribute("name",name);    //方法里返回的也是键值对，("传给页面的字段"，”所要传的参数“)，跟tp5的 $this->assign("name",name)一样
        //把参数返回到templates/hello.html 下的这个页面
        return "hello";
    }

}
