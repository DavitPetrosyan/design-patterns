package com.companyname.designpatterns.behavioral.chainofresponsibility.impl;


import com.companyname.designpatterns.behavioral.chainofresponsibility.api.EmailSender;

/**
 * Created by davitpetrosyan on 11/28/16.
 */
public class OutlookSender implements EmailSender {

	EmailSender nextEmailSender;

	public void setNextEmailSender(EmailSender nextEmailSender) {
		this.nextEmailSender = nextEmailSender;
	}


	@Override
	public void sendEmail(String to, String content) {
		System.out.println("send email to " + to + " with content['" + content +"'] via outlook..." );
		if(nextEmailSender != null) {
			nextEmailSender.sendEmail(to, content);
		}
	}
}
