package com.hackathon.rosatom.atombabr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
Это главный класс приложения. Он будет принимать сообщения и принимать решения - кому что переслать и что записать в базу.
 */

@RestController
@RequestMapping("message")
public class MessageController {
    @GetMapping
    public Message message(@RequestParam(value = "sender") String sender,
                           @RequestParam(value = "recipient") String recipient,
                           @RequestParam(value = "message") String message) {

        return new Message(sender,recipient,message);
    }
}
