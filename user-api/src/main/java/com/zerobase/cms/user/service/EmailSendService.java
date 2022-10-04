package com.zerobase.cms.user.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {

    private final MailgunClient mailgunClient;

    public String sendEmail() {
        SendMailForm form = SendMailForm.builder()
                .from("zerobase-test@my.com")
                .to("skawk3235@gmail.com")
                .subject("Test email from zerobase")
                .text("my text!!")
                .build();
        return mailgunClient.sendEmail(form).getBody();
    }
}
