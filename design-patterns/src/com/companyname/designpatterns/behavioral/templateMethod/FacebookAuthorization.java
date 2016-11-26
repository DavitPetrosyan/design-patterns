package com.companyname.designpatterns.behavioral.templateMethod;

/**
 * Created by davitpetrosyan on 11/26/16.
 */
public class FacebookAuthorization extends ProjectAuthorization {
	@Override
	boolean isLoggedOnUser() throws RuntimeException {
		System.out.println("check is user logged on, in facebook specific way");
		return false;
	}

	@Override
	boolean hasAnyUnpaidInvoices() throws RuntimeException {
		System.out.println("check does user has unpaid invoices, in facebook specific way");
		return false;
	}

	@Override
	void writeLogs() {
		System.out.println("write logs via sfl4j, in facebook specific way");
	}

	@Override
	User login(String userName, String password) {
		System.out.println("logging on the user, in facebook specific way");
		return new User();
	}
}
