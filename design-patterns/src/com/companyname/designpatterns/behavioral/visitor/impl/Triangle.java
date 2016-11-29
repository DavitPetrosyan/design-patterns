package com.companyname.designpatterns.behavioral.visitor.impl;

import com.companyname.designpatterns.behavioral.visitor.api.PainterVisitor;
import com.companyname.designpatterns.behavioral.visitor.api.Shape;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class Triangle implements Shape{

	int h, alpha;

	public Triangle(int h, int alpha) {
		this.h = h;
		this.alpha = alpha;
	}

	@Override
	public void accept(PainterVisitor visitor) {
		visitor.visit(this);
	}
}
