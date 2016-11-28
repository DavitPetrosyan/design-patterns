package com.companyname.designpatterns.behavioral.chainofresponsibility;


import com.companyname.designpatterns.behavioral.chainofresponsibility.api.EmailSender;
import com.companyname.designpatterns.behavioral.chainofresponsibility.impl.GmailSender;
import com.companyname.designpatterns.behavioral.chainofresponsibility.impl.OutlookSender;
import com.companyname.designpatterns.behavioral.chainofresponsibility.impl.YahooSender;
import com.companyname.designpatterns.behavioral.chainofresponsibility.impl.YandexSender;

/**
 * Created by davitpetrosyan on 11/28/16.
 */
public class Main {


	public static void main(String[] args) {
		EmailSender outlookEmailSender = new OutlookSender();
		EmailSender gmailEmailSender = new GmailSender();
		EmailSender yahooEmailSender = new YahooSender();
		EmailSender yandexEmailSender = new YandexSender();

		outlookEmailSender.setNextEmailSender(gmailEmailSender);
		yahooEmailSender.setNextEmailSender(outlookEmailSender);
		yandexEmailSender.setNextEmailSender(yahooEmailSender);

		yandexEmailSender.sendEmail("toDavit", "withThisContent");
	}
}
