package com.companyname.designpatterns.behavioral.visitor.impl;

import com.companyname.designpatterns.behavioral.visitor.api.PainterVisitor;
import com.companyname.designpatterns.behavioral.visitor.api.Shape;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class Cycle implements Shape {

	int radius;

	public Cycle(int radius) {
		this.radius = radius;
	}

	@Override
	public void accept(PainterVisitor visitor) {
		visitor.visit(this);
	}
}
