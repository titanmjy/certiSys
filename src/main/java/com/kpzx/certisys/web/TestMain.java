package com.kpzx.certisys.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMain {

    @RequestMapping("/index")
    public String index(){
        return "hello springboot";
    }
}
