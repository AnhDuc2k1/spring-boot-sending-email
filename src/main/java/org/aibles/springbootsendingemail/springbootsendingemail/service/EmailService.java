package org.aibles.springbootsendingemail.springbootsendingemail.service;

import org.aibles.springbootsendingemail.springbootsendingemail.dto.MailRequestDto;

public interface EmailService {
    void sendSimpleMessage(MailRequestDto mailRequestDto);
}
