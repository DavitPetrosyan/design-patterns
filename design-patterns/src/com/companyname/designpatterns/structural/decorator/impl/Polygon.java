package com.companyname.designpatterns.structural.decorator.impl;


import com.companyname.designpatterns.structural.decorator.api.Shape;

/**
 * Created by david.petrosyan on 7/28/2016.
 */
public class Polygon implements Shape {

	public Polygon() {
		System.out.println("Create new instance of polygon");
	}

	@Override
	public void draw() {
		System.out.println("Drawing polygon...");
	}

	public void onlyPolygonSpecificMethod() {
		System.out.println("The method, which related only to polygon");
	}
}
