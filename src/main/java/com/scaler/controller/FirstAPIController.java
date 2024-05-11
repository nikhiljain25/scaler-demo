package com.scaler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPIController {

    @RequestMapping("/product")
    public String sayHello(){
        return "Hello Class !";
    }

    @GetMapping("/product/{name}")
    public String secondAPI(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("/product/{name}/{times}")
    public String thirdAPI(@PathVariable String name, @PathVariable int times) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < times; i++) {
            str.append(name).append(" ").append(i + 1).append("\n");
        }
        return str.toString();
    }
}
