package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "second version of code from rakesh Goud released on  24th of september";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Thankyou for the information!";
    }
}
