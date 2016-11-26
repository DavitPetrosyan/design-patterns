package com.companyname.designpatterns.creational.prototype;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by davitpetrosyan on 11/26/16.
 */
public class Main {


	public static void main(String[] args) throws CloneNotSupportedException {

		Set<String> workbook = new HashSet<String>();
		workbook.add("Eyesoft");
		workbook.add("Monitis");
		workbook.add("Synergy");

		WorkBook davitsWorkBook = new WorkBook(workbook);


		WorkBook gnunisWorkBook = (WorkBook)davitsWorkBook.clone();
		gnunisWorkBook.addHistory("SCDM");

		WorkBook ashotsWorkBook = (WorkBook)davitsWorkBook.clone();
		ashotsWorkBook.removeHistory("Monitis");

		System.out.println(davitsWorkBook.getEmployeeCompanyHistory().toString());
		System.out.println(gnunisWorkBook.getEmployeeCompanyHistory().toString());
		System.out.println(ashotsWorkBook.getEmployeeCompanyHistory().toString());


	}
}
