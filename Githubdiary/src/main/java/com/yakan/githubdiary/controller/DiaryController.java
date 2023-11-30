package com.yakan.githubdiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiaryController {
    @GetMapping("/")
    public String ListView(){
        return "index";
    }
}
