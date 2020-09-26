package com.hackathon.rosatom.atombabr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("message")
public class MessageController {
    @GetMapping
    public List<Map<String,String>> messages = new ArrayList<Map<String, String>>() {{
        add(new  HashMap<String,String>)
    }}
    public String list() {
        return "index";
    }
}
