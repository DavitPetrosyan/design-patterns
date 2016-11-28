package com.companyname.designpatterns.behavioral.chainofresponsibility.api;

/**
 * Created by davitpetrosyan on 11/28/16.
 */
public interface EmailSender {

	void sendEmail(String to, String content);

	void setNextEmailSender(EmailSender outlookEmailSender);
}