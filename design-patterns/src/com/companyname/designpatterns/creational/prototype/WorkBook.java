package com.companyname.designpatterns.creational.prototype;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by davitpetrosyan on 11/26/16.
 */
public class WorkBook implements Cloneable {

	private Set<String> employeeCompanyHistory;



	public WorkBook() {
		employeeCompanyHistory = new HashSet<String>();
	}

	public WorkBook(Set<String> employeeCompanyHistory) {
		this.employeeCompanyHistory = employeeCompanyHistory;
	}



	public void addHistory(String company) {
		this.employeeCompanyHistory.add(company);
	}

	public void removeHistory(String company) {
		this.employeeCompanyHistory.remove(company);
	}



	public Set<String> getEmployeeCompanyHistory() {
		return this.employeeCompanyHistory;
	}

	public void setEmployeeCompanyHistory(Set<String> employeeCompanyHistory) {
		this.employeeCompanyHistory = employeeCompanyHistory;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		Set<String> clonedObject = new HashSet<String>(this.getEmployeeCompanyHistory());
		return new WorkBook(clonedObject);
	}
}
