package org.daniel.study.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generic/")
public class GenericController {
    @RequestMapping("hello")
    public String getHello() {
        return "Hello";
    }
}
