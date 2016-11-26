package com.companyname.designpatterns.behavioral.templateMethod;

/**
 * Created by davitpetrosyan on 11/26/16.
 */
public class Main {

	public static void main(String[] args) {

		ProjectAuthorization googleAuthorization = new GoogleAuthorization();
		ProjectAuthorization facebookAuthorization = new FacebookAuthorization();

		//both are validate user with the same order of methods, but each one in specific way
		googleAuthorization.validateUser("davit", "password");
		facebookAuthorization.validateUser("davit", "password");

	}
}
