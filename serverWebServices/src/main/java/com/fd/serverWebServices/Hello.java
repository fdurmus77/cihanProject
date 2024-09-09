package com.fd.serverWebServices;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "Hello")
public class Hello {

    @GetMapping({"/merhaba", "/merhaba/{name}"})
    public String merhaba(@PathVariable(required = false) String name) {
        return "Merhaba. " + (name == null ? "" : name);
    }
}
