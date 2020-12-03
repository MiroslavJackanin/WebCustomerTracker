package sk.miro.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyTestController {

    @RequestMapping("/list")
    public String listCustomers(){
        return "test-list";
    }
}
