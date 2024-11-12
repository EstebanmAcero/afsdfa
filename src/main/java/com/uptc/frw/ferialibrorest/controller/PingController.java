package com.uptc.frw.ferialibrorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PingController {
    @GetMapping("/ping") // es un entrada de datos que corresponde por el metodo get
    public String pong(){
        return "pong";

    }
}

