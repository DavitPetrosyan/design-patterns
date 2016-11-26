package com.companyname.designpatterns.structural.bridge.impl;

import com.companyname.designpatterns.structural.bridge.api.ApplicationCall;
import com.companyname.designpatterns.structural.bridge.api.ElectronicGadget;

/**
 * Created by davitpetrosyan on 11/27/16.
 */
public class Laptop extends ElectronicGadget {

	public Laptop(ApplicationCall applicationCall) {
		super(applicationCall);
	}

	@Override
	public void callTo(String name) {
		System.out.println("System is call to " + name);
		applicationCall.doCall();
	}
}
