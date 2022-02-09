package org.aibles.springbootsendingemail.springbootsendingemail.service.impl;

import org.aibles.springbootsendingemail.springbootsendingemail.dto.MailRequestDto;
import org.aibles.springbootsendingemail.springbootsendingemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Override
    public void sendSimpleMessage(MailRequestDto mailRequestDto) {
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("anhduc2k1vn@gmail.com");
            message.setTo(mailRequestDto.getReceiverEmail());
            message.setSubject(mailRequestDto.getSubject());
            message.setText(mailRequestDto.getText());
            emailSender.send(message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
