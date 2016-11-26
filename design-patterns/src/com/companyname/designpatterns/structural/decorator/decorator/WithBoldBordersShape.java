package com.companyname.designpatterns.structural.decorator.decorator;

/**
 * Created by david.petrosyan on 7/28/2016.
 */

import com.companyname.designpatterns.structural.decorator.api.Shape;

/**
 * Class is also implement shape, to imitate all others, who want to use WithBoldBordersShape, that WithBoldBordersShape also Shape.
 */
public class WithBoldBordersShape implements Shape {

	//instance of class, which we should decorate
	public PaintedShape withBoldBordersPaintedShape;

	public WithBoldBordersShape(PaintedShape paintedShape) {
		System.out.println("Creating new decorated instance of already decorated class - 'with bold borders painted shape'");
		this.withBoldBordersPaintedShape = paintedShape;
	}

	/**
	 * It is very important to override ALL methods of PaintedShape class, that this decorated class also can be(behave) as a PaintedShape
	 */
	public void onlyPolygonSpecificMethod() {
		this.withBoldBordersPaintedShape.onlyPolygonSpecificMethod();
	}
	public void onlyPaintedShapeSpecificMethod() {
		this.withBoldBordersPaintedShape.onlyPaintedShapeSpecificMethod();
	}
	public void paint(String redColor) {
		this.withBoldBordersPaintedShape.paint(redColor);
	}


	@Override
	public void draw() {
		this.withBoldBordersPaintedShape.draw();
		setBoldBorders();
	}

	/**
	 * This method logic was the reason, to decorate PaintedShape.
	 * This method logic should be called after draw paintedShape.
	 *
	 * NOTE: Does not related to any other class. PaintedShape own method.
	 */
	public void setBoldBorders() {
		System.out.println("Set bold borders to already drew shape with red color...");
	}

	public void onlyWithBoldBordersShapeSpecificMethod() {
		System.out.println("This is only WithBoldBordersShape specific method. " +
				"WithBoldBordersShape class onw method. " +
				"Does nor related to any class.");
	}
}
