package com.companyname.designpatterns.behavioral.visitor.api;

import com.companyname.designpatterns.behavioral.visitor.impl.Cycle;
import com.companyname.designpatterns.behavioral.visitor.impl.Oval;
import com.companyname.designpatterns.behavioral.visitor.impl.Triangle;

/**
 * Created by davitpetrosyan on 11/29/16.
 */
public interface PainterVisitor {

	void visit(Cycle cycle);
	void visit(Triangle triangle);
	void visit(Oval oval);
}
