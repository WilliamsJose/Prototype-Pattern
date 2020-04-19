package model;

import abstracts.Shape;

public class Circle extends Shape {
	private String type;
	
	public Circle() {}
	
	public Circle(Circle circle) {
		super(circle);
		if(circle != null) {
			this.type = circle.type;
		}
	}
	
	@Override
	public String showInfo() {
		return "id: "+this.getId()+"\nType: "+this.getType()+"\nType of this: "+this.type;
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}
	
}
