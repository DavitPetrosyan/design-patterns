package com.companyname.designpatterns.behavioral.command;

import com.companyname.designpatterns.behavioral.command.api.Command;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class CommandsInvoker {

	Command command;

	public CommandsInvoker(Command command) {
		this.command = command;
	}

	void execute(String filter) {
		this.command.execute(filter);
	}

}
