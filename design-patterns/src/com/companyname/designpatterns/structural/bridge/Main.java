package com.companyname.designpatterns.structural.bridge;

import com.companyname.designpatterns.structural.bridge.api.ApplicationCall;
import com.companyname.designpatterns.structural.bridge.api.ElectronicGadget;
import com.companyname.designpatterns.structural.bridge.impl.Laptop;
import com.companyname.designpatterns.structural.bridge.impl.PC;
import com.companyname.designpatterns.structural.bridge.impl.Skype;
import com.companyname.designpatterns.structural.bridge.impl.Viber;

/**
 * Created by davitpetrosyan on 11/27/16.
 */
public class Main {

	public static void main(String[] args) {
		ApplicationCall skypeApplicationCall = new Skype();
		ApplicationCall viberApplicationCall = new Viber();


		ElectronicGadget laptop = new Laptop(skypeApplicationCall);
		laptop.callTo("davit");

		ElectronicGadget pc = new PC(viberApplicationCall);
		pc.callTo("davit");
	}

}
