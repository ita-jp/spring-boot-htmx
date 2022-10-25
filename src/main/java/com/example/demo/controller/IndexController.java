package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping(value = "swap", headers = "HX-Request")
    @ResponseBody
    public String swap() {
        return "<p id=\"time\">" + LocalDateTime.now() + "</p>";
    }

    @GetMapping(value = "data1", headers = "HX-Request")
    @ResponseBody
    public String data1() throws InterruptedException {
        Thread.sleep(1000);
        return "<p>data1</p>";
    }

    @GetMapping(value = "data2", headers = "HX-Request")
    @ResponseBody
    public String data2() throws InterruptedException {
        Thread.sleep(2000);
        return "<p>data2</p>";
    }

    @GetMapping(value = "data3", headers = "HX-Request")
    @ResponseBody
    public String data3() throws InterruptedException {
        Thread.sleep(3000);
        return "<p>data3</p>";
    }
}
