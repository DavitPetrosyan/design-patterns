package com.companyname.designpatterns.creational.builder;

import java.util.Arrays;

/**
 * Created by davitpetrosyan on 11/26/16.
 */
public class Main {

	public static void main(String[] args) {

		Student davit = new Student.Builder()
				.name("davit")
				.age(26)
				.language(Arrays.asList("armenian", "english", "russian"))
				.build();

		System.out.println(davit);
	}

}
