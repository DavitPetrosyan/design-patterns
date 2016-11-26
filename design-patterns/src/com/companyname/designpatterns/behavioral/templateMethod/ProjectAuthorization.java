package com.companyname.designpatterns.behavioral.templateMethod;

/**
 * Created by davitpetrosyan on 11/26/16.
 */
public abstract class ProjectAuthorization {

	final void validateUser(String userName, String password) {
		isLoggedOnUser();
		hasAnyUnpaidInvoices();
		writeLogs();
		login(userName, password);
	}


	abstract boolean isLoggedOnUser() throws RuntimeException;
	abstract boolean hasAnyUnpaidInvoices() throws RuntimeException;
	abstract void writeLogs();
	abstract User login(String userName, String password);

}
