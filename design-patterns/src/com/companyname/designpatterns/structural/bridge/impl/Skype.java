package com.companyname.designpatterns.structural.bridge.impl;

import com.companyname.designpatterns.structural.bridge.api.ApplicationCall;

/**
 * Created by davitpetrosyan on 11/27/16.
 */
public class Skype implements ApplicationCall {
	@Override
	public void doCall() {
		System.out.println(" via SKYPE");
	}
}
