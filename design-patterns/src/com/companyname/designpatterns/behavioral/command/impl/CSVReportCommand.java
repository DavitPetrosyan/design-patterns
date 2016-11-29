package com.companyname.designpatterns.behavioral.command.impl;

import com.companyname.designpatterns.behavioral.command.api.Command;
import com.companyname.designpatterns.behavioral.command.api.ReportExecutor;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class CSVReportCommand implements Command {

	ReportExecutor reportExecutor;

	public CSVReportCommand(ReportExecutor reportExecutor) {
		this.reportExecutor = reportExecutor;
	}

	@Override
	public void execute(String filters) {
		this.reportExecutor.executeCSVReport(filters);
	}
}
