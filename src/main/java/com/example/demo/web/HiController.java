package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ll on 2017/8/1.
 */
@Controller
@RequestMapping("/Hi")
public class HiController {
    @RequestMapping("/")
    public String index() {
        return "Hiindex";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "Hihello";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
