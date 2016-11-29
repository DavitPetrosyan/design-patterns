package com.companyname.designpatterns.behavioral.command.api;

import java.io.File;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public interface ReportExecutor {

	File executeHTMLReport(String filters);
	File executePDFReport(String filters);
	File executeCSVReport(String filters);
	File executeExcelReport(String filters);
}
