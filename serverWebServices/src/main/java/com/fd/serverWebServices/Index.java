package com.fd.serverWebServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @GetMapping
    public String index () {
        return "index";
    }
}
