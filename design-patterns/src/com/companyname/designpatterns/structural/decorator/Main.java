package com.companyname.designpatterns.structural.decorator;


import com.companyname.designpatterns.structural.decorator.api.Shape;
import com.companyname.designpatterns.structural.decorator.decorator.PaintedShape;
import com.companyname.designpatterns.structural.decorator.decorator.WithBoldBordersShape;
import com.companyname.designpatterns.structural.decorator.impl.Polygon;

/**
 * Created by david.petrosyan on 7/28/2016.
 */
public class Main {


	public static void main(String[] args) {

		Shape paintedShape = new PaintedShape(new Polygon());
		paintedShape.draw();
		Shape withBoldBordersShape = new WithBoldBordersShape(new PaintedShape(new Polygon()));
		withBoldBordersShape.draw();

	}

}
