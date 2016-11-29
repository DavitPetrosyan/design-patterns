package com.companyname.designpatterns.behavioral.visitor.api;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public interface Shape {
	void accept(PainterVisitor visitor);
}
