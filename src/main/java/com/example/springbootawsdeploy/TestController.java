package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "updated information from rakesh Goud!";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Thankyou! Messages delivered";
    }
}
