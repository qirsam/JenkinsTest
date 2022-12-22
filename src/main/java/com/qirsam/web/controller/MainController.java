package com.qirsam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model){
        String message = "Change me, please";
        model.addAttribute("message", message);
        return "index";
    }
}
