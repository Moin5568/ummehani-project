package com.example.ummehani;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class monu {
    @GetMapping("/monu")
    public String getData () {return "Hello Devops Engineer Moin Nisar Shaikh " ;}
}