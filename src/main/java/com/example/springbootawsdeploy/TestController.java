package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "second version of  spring code from rakesh Goud released on 29th NOVEMBER!";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Thank you for the message! Noted as 2nd release of the date";
    }
}
