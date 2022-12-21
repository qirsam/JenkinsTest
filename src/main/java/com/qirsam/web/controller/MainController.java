package com.qirsam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model){
        String message = "Поменяй меня";
        model.addAttribute("message", message);
        return "index";
    }
}
