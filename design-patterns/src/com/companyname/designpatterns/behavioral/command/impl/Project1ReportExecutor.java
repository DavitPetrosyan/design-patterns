package com.companyname.designpatterns.behavioral.command.impl;

import com.companyname.designpatterns.behavioral.command.api.ReportExecutor;

import java.io.File;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class Project1ReportExecutor implements ReportExecutor {

	@Override
	public File executeHTMLReport(String filters) {
		System.out.println("Generate report file as HTML via filters['" + filters + "'] in project1 specific way");
		return new File("html.html");
	}

	@Override
	public File executePDFReport(String filters) {
		System.out.println("Generate report file as PDF via filters['" + filters + "'] in project1 specific way");
		return new File("pdf.pdf");
	}

	@Override
	public File executeCSVReport(String filters) {
		System.out.println("Generate report file as CSV via filters['" + filters + "'] in project1 specific way");
		return new File("csv.csv");
	}

	@Override
	public File executeExcelReport(String filters) {
		System.out.println("Generate report file as EXCEL via filters['" + filters + "'] in project1 specific way");
		return new File("excel.xls");
	}
}
