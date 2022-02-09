package org.aibles.springbootsendingemail.springbootsendingemail.controller;

import org.aibles.springbootsendingemail.springbootsendingemail.dto.MailRequestDto;
import org.aibles.springbootsendingemail.springbootsendingemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private EmailService emailService;

    @GetMapping
    public void createMail(@RequestBody MailRequestDto mailRequestDto){
        emailService.sendSimpleMessage(mailRequestDto);
    }

}
