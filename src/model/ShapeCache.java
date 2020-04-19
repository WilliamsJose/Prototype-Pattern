package model;

import java.util.HashMap;

import abstracts.Shape;

public class ShapeCache {
	
	private HashMap<String, Shape> shapeCache = new HashMap<String, Shape>();

	public Shape getShape(String key) {
		return shapeCache.get(key).clone();
	}
	
	public Shape putShape(String key, Shape shape) {
		shapeCache.put(key, shape);
		return shape;
	}
	
}
