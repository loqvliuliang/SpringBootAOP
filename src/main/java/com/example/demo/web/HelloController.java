package com.example.demo.web;

import com.example.demo.exception.MyException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ll on 2017/8/1.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping("/hello1")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }


    @RequestMapping("/json")
    public String json() throws MyException{
        throw  new MyException("json");
    }


}
