package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WXM on 2017/8/8.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {

        return "Hello World";
    }
}
