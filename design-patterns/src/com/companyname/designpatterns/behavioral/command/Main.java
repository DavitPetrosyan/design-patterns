package com.companyname.designpatterns.behavioral.command;

import com.companyname.designpatterns.behavioral.command.api.ReportExecutor;
import com.companyname.designpatterns.behavioral.command.impl.ExcelReportCommand;
import com.companyname.designpatterns.behavioral.command.impl.Project1ReportExecutor;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class Main {

	public static void main(String[] args) {
		ReportExecutor reportExecutorForProject1 = new Project1ReportExecutor();
		ExcelReportCommand excelReportCommand = new ExcelReportCommand(reportExecutorForProject1);
		CommandsInvoker commandsInvoker = new CommandsInvoker(excelReportCommand);
		commandsInvoker.execute("custom_filter");
	}
}
