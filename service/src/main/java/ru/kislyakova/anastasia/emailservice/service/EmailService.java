package ru.kislyakova.anastasia.emailservice.service;

import org.springframework.mail.MailException;
import ru.kislyakova.anastasia.emailmodel.dto.EmailCreationDto;
import ru.kislyakova.anastasia.emailmodel.entity.Email;

import java.util.List;

public interface EmailService {
    Email sendEmail(EmailCreationDto emailDto) throws MailException;
    List<Email> getEmails();
    Email getEmailById(int emailId);
}
