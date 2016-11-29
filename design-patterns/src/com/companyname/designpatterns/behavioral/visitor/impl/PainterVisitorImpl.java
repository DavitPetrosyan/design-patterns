package com.companyname.designpatterns.behavioral.visitor.impl;

import com.companyname.designpatterns.behavioral.visitor.api.PainterVisitor;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class PainterVisitorImpl implements PainterVisitor {
	@Override
	public void visit(Cycle cycle) {
		System.out.println("Paint shape in CYCLE specific colors");
	}

	@Override
	public void visit(Triangle triangle) {
		System.out.println("Paint shape in TRIANGLE specific colors");
	}

	@Override
	public void visit(Oval oval) {
		System.out.println("Paint shape in OVAL specific colors");
	}
}
