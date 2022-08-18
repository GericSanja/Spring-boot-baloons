package com.example.demo.controller;

import com.example.demo.service.ServiceSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerSpring {
    @Autowired
    ServiceSpring serviceSpring;

    @PostMapping("strings")
    public String baloonString(@RequestParam("string") String string, Model model) {
        String str = "There is/are " + ServiceSpring.maxNumberOfBalloons(string) + " ballon/s.";
        model.addAttribute("strings", str);

        return "start";
    }

    @GetMapping()
    public String start() {
        return "start";

    }


}
