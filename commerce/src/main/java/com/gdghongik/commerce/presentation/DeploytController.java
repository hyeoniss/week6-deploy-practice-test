package com.gdghongik.commerce.presentation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploytController {

    @GetMapping("/deploy-check")
    public String deployCheck() {
        return "Hello, deployment! v2";
    }

}
