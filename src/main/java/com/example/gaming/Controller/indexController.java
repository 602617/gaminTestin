package com.example.gaming.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    //penis
    @GetMapping("/")
    public String index(){
        return "index";
    }


}
