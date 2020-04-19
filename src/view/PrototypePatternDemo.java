package view;

import model.Rectangle;
import model.ShapeCache;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setId("rect1");
		rect.setType("Rhombus");
		
		System.out.println(rect.showInfo());
		
		Rectangle rect2 = new Rectangle();
		rect2 = (Rectangle) rect.clone();
		System.out.println(rect2.showInfo());
		
		System.out.println("\nthen...");
		
		ShapeCache shapeCache = new ShapeCache();
		shapeCache.putShape("First rhombus rectangle", rect);
		shapeCache.putShape("Second rhombus rectangle", rect2);
		
		System.out.println("\nGet from shape cache:");
		System.out.println("First: "+shapeCache.getShape("First rhombus rectangle"));
		System.out.println(shapeCache.getShape("First rhombus rectangle").showInfo());
		System.out.println("\nSecond: "+shapeCache.getShape("Second rhombus rectangle"));
		System.out.println(shapeCache.getShape("Second rhombus rectangle").showInfo());
	}

}
