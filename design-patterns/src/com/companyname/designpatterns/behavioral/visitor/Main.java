package com.companyname.designpatterns.behavioral.visitor;

import com.companyname.designpatterns.behavioral.visitor.api.PainterVisitor;
import com.companyname.designpatterns.behavioral.visitor.api.Shape;
import com.companyname.designpatterns.behavioral.visitor.impl.Cycle;
import com.companyname.designpatterns.behavioral.visitor.impl.Triangle;
import com.companyname.designpatterns.behavioral.visitor.impl.PainterVisitorImpl;

/**
 * Created by davitpetrosyan on 11/30/16.
 */
public class Main {


	public static void main(String[] args) {

		Shape[] shapes = new Shape[3];

		shapes[0] = new Cycle(5);
		shapes[1] = new Triangle(6, 60);
		shapes[2] = new Cycle(4);

		PainterVisitor visitor = new PainterVisitorImpl();
		for(Shape shape : shapes){
			shape.accept(visitor);
		}
	}
}
