package com.companyname.designpatterns.structural.decorator.decorator;


/**
 * Created by david.petrosyan on 7/28/2016.
 */

import com.companyname.designpatterns.structural.decorator.api.Shape;
import com.companyname.designpatterns.structural.decorator.impl.Polygon;

/**
 * Class is also implement shape, to imitate all others, who want to use PaintedShape, that PaintedShape also Shape.
 */
public class PaintedShape implements Shape {

	//instance of class, which we should decorate
	public Polygon paintedPolygon;

	public PaintedShape(Polygon polygon) {
		System.out.println("Creating new decorated instance - 'painted shape'");
		this.paintedPolygon = polygon;
	}

	/**
	 * It is very important to override ALL methods of POLYGON class, that this decorated class also can be(behave) as a Polygon
	 */
	public void onlyPolygonSpecificMethod() {
		this.paintedPolygon.onlyPolygonSpecificMethod();
	}



	@Override
	public void draw() {
		paintedPolygon.draw();
		paint("red");
	}


	/**
	 * This method logic was the reason, to decorate Polygon.
	 * This method logic should be called after draw polygon.
	 *
	 * NOTE: Does not related to any other class. PaintedShape own method.
	 * @param redColor   Polygon area should be paint with this color.
	 */
	public void paint(String redColor) {
		System.out.println("Paint already drew shape with " + redColor + " color...");
	}


	public void onlyPaintedShapeSpecificMethod() {
		System.out.println("This is only PaintedShape specific method. " +
				"PaintedShape class onw method. " +
				"Does nor related to any class.");
	}
}
