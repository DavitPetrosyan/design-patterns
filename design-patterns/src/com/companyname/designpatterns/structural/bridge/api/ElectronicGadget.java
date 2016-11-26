package com.companyname.designpatterns.structural.bridge.api;

/**
 * Created by davitpetrosyan on 11/27/16.
 */
public abstract class ElectronicGadget {

	public ApplicationCall applicationCall;

	public ElectronicGadget(ApplicationCall applicationCall){
		this.applicationCall = applicationCall;
	}


	public abstract void callTo(String name);

}
