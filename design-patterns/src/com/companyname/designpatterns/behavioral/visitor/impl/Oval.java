package com.companyname.designpatterns.behavioral.visitor.impl;

import com.companyname.designpatterns.behavioral.visitor.api.PainterVisitor;
import com.companyname.designpatterns.behavioral.visitor.api.Shape;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class Oval implements Shape {

	int x;

	public Oval(int x) {
		this.x = x;
	}

	@Override
	public void accept(PainterVisitor visitor) {
		visitor.visit(this);
	}
}
