package com.offcn.demo.controller;


import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class FirstThymeleafController {
    @RequestMapping("/index")
    public String toIndex(Model model) {
        model.addAttribute("message", "hello Thymeleaf");
        User user = new User(1, "张三", 25);
        model.addAttribute("user", user);
        Map map = new HashMap<>();
        map.put("id", 2);
        map.put("name", "李四");
        map.put("sex", "男");
        model.addAttribute("map", map);
        return "index";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        User user1 = new User(1, "张三", 25);
        User user2 = new User(2, "张二", 26);
        User user3 = new User(3, "张四", 27);
        User user4 = new User(4, "张五", 28);
        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("list", list);
        return "index2";
    }


    @RequestMapping("/setValue")
    public String setValue(Model model){
        model.addAttribute("username","张三");
        return "index3";
    }

    @RequestMapping("/checkValue")
    public String checkValue(Model model) {
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index4";
    }


    @RequestMapping("/testFun")
    public String testFun(Model model){
        Date date = new Date();
        model.addAttribute("date",date);
        double price = 123456.789D;
        model.addAttribute("price",price);
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("str",str);
        return "index5";
    }
}
