package com.companyname.designpatterns.structural.decorator.impl;


import com.companyname.designpatterns.structural.decorator.api.Shape;

/**
 * Created by david.petrosyan on 7/28/2016.
 */
public class Rectangle implements Shape {

	public Rectangle() {
		System.out.println("Create new instance of shape");
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectangle...");
	}

	public void onlyRectangleSpecificMethod() {
		System.out.println("The method, which related only to rectangle");
	}
}
