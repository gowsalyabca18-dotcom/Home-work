package com.example.logger;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    
    private final Service service;

    LogController(Service service)
    {
        this.service=service;
    }

}
